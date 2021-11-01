import com.google.inject.Provider;

import javax.inject.Inject;
import java.util.Map;
import java.util.Random;

public class DiscountProvider implements Provider<Discount> {
    private final Random random;
    private final Map<Integer,Discount> mapBinder;

    @Inject
    public DiscountProvider(Map<Integer,Discount> mapBinder, Random random){
        this.mapBinder=mapBinder;
        this.random=random;
    }

    @Override
    public Discount get() {
        return mapBinder.get(random.nextInt(mapBinder.size()));
    }
}
