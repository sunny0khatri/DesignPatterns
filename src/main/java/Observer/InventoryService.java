package Observer;

public class InventoryService implements OnOrderPlacedSubscriber{

    InventoryService(){
        Amazon amazon=Amazon.getInstance();
        amazon.register(this);
    }
    @Override
    public void notifyOrderPlaced() {
        System.out.println("Order Placed, InventoryService");
    }
}
