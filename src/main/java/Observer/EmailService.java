package Observer;

public class EmailService implements OnOrderPlacedSubscriber{

    EmailService(){
        Amazon amazon=Amazon.getInstance();
        amazon.register(this);
    }
    @Override
    public void notifyOrderPlaced() {
        System.out.println("Order placed, EmailService");
    }
}
