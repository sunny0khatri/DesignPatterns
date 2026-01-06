package Decorator;

public class StrawberryScoop implements IceCream{
    private IceCream iceCream;
    private int cost=30;
    private String desc="Strawberry-Scoop ";


    StrawberryScoop(IceCream iceCream){
        this.iceCream=iceCream;
    }


    @Override
    public String getDescription() {
        if(iceCream!=null)
            return iceCream.getDescription()+desc;
//        return "";
        throw new RuntimeException("Icecream cannot start with scoop/topping, choose a cone first");
    }

    @Override
    public int getCost() {
        if(iceCream!=null)
            return iceCream.getCost()+cost;
        throw new RuntimeException("Icecream cannot start with scoop/topping, choose a cone first");
    }
}
