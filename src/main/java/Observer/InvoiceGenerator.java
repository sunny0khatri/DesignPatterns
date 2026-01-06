package Observer;

public class InvoiceGenerator implements OnOrderPlacedSubscriber{

    InvoiceGenerator(){
        Amazon amazon=Amazon.getInstance();
        amazon.register(this);
    }
    @Override
    public void notifyOrderPlaced() {
        System.out.println("Order Placed, InvoiceGenerator");
    }
}
