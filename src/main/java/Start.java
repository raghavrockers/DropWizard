import com.google.inject.Guice;
import com.google.inject.Injector;

import javax.inject.Inject;

public class Start {

    private final Checkout checkout;

    @Inject
    public Start(Checkout checkout){
        this.checkout=checkout;
    }

    public void ready(){
        System.out.println("the final price is "+ checkout.order(10));
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DiscountModule());
        Start start = injector.getInstance(Start.class);
        start.ready();
//        Checkout checkout = injector.getInstance(Checkout.class);
//        System.out.println("the final price is "+ checkout.order(10));
    }
}
