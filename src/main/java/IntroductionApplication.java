import io.dropwizard.Application;
import io.dropwizard.configuration.ResourceConfigurationSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import java.util.ArrayList;
import java.util.List;

public class IntroductionApplication extends Application<BasicConfiguration> {

    @Override
    public void run(BasicConfiguration basicConfiguration, Environment environment) {
//        int defaultSize = basicConfiguration.getDefaultSize();
//        BrandRepository brandRepository = new BrandRepository(initBrands());
//        BrandResource brandResource = new BrandResource(defaultSize, brandRepository);
        MessageResource messageResource = new MessageResource();

        environment
                .jersey()
                .register(messageResource);
    }

    private List<Brand> initBrands() {
        List<Brand> lota = new ArrayList<>();
        Brand b1 = new Brand(1L,"lava");
        Brand b2 = new Brand(2L,"samsung");
        Brand b3 = new Brand(3L,"apple");
        Brand b4 = new Brand(4L,"oneplus");
        Brand b5 = new Brand(5L,"oppo");
        lota.add(b1);
        lota.add(b2);
        lota.add(b3);
        lota.add(b4);
        lota.add(b5);
        return lota;
    }

    public static void main(String[] args) throws Exception {
        new IntroductionApplication().run("server", "introduction-config.yml");
    }

    @Override
    public void initialize(Bootstrap<BasicConfiguration> bootstrap) {
        bootstrap.setConfigurationSourceProvider(new ResourceConfigurationSourceProvider());
        super.initialize(bootstrap);
    }
}
