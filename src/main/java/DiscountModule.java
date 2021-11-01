import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.hibernate.cfg.annotations.MapBinder;


public class DiscountModule extends AbstractModule {
    @Override
    protected void configure() {

        MapBinder<Integer,Discount> mapBinder = MapBinder.newMapBinder(binder(),Integer.class,Discount.class);

        mapBinder.add

        bind(Discount.class).toProvider(DiscountProvider.class);
    }

}
