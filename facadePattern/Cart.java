package facadePattern;

public class Cart implements HotelService{

    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    public String requestCart(int numberOfCarts) {
        return "You have requested " + numberOfCarts + " luggage cart(s).";
    }

    @Override
    public void executeService() {
        System.out.println(requestCart(numberOfCarts));
    }
}
