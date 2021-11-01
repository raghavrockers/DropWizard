import javax.inject.Inject;
import javax.inject.Provider;

public class Checkout {
    private final Discount discount;
    @Inject
    public Checkout(Discount discount){
        this.discount=discount;
    }

    public double order(double price){
        System.out.println(price);
        System.out.println(discount.apply());
        return price-(price*discount.apply());
    }
}
