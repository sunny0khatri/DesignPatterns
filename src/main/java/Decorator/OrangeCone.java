package Decorator;

public class OrangeCone implements IceCream{

    private int cost=10;
    private String desc="Orange-Cone ";

    private IceCream iceCream;

    //making orange cone as base class only, not allowed as topping
    OrangeCone(){}


    @Override
    public String getDescription() {
        if(iceCream==null)
            return desc;
        return iceCream.getDescription()+desc;
    }

    @Override
    public int getCost() {
        if(iceCream==null)
            return cost;
        return iceCream.getCost()+cost;
    }
}
