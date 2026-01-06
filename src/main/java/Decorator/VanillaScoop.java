package Decorator;

public class VanillaScoop implements IceCream{
    private int cost=20;
    private String desc="Vanilla-Scoop ";
    private IceCream iceCream;


    VanillaScoop(IceCream iceCream){
        this.iceCream=iceCream;
    }

    @Override
    public String getDescription() {
        if(iceCream!=null)
            return iceCream.getDescription()+desc;
//        return "Invalid IceCream";
        throw new RuntimeException("Icecream cannot start with scoop/topping, choose a cone first");
    }

    @Override
    public int getCost() {
        if(iceCream!=null)
            return iceCream.getCost()+cost;
//        return 0;   //invalid icecream;
        throw new RuntimeException("Icecream cannot start with scoop/topping, choose a cone first");
    }
}
