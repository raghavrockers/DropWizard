public class LateDiscount implements Discount{
    @Override
    public double apply() {
        return 0.50;
    }
}
