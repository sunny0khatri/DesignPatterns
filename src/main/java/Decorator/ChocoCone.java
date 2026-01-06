package Decorator;

public class ChocoCone implements IceCream{
    private IceCream iceCream;
    private int cost=5;
    private String desc="Choco-Cone ";

    ChocoCone(){}

    ChocoCone(IceCream iceCream){
        this.iceCream=iceCream;
    }

    @Override
    public String getDescription() {
        if(iceCream!=null)
            return iceCream.getDescription()+desc;
        return desc;
    }

    @Override
    public int getCost() {
        if(iceCream!=null)
            return iceCream.getCost()+cost;
        return cost;
    }
}
