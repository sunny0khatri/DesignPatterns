package Decorator;

public class ChocoChips implements IceCream{

    private int cost=10;
    private String desc="Choco-Chips ";
    private IceCream iceCream;



    ChocoChips(IceCream iceCream){
        this.iceCream=iceCream;
    }

    @Override
    public String getDescription() {
        if(iceCream!=null)
            return iceCream.getDescription()+desc;
        throw new RuntimeException("Icecream cannot start with scoop/topping, choose a cone first");
    }

    @Override
    public int getCost() {
        if(iceCream!=null)
            return iceCream.getCost()+cost;
        throw new RuntimeException("Icecream cannot start with scoop/topping, choose a cone first");
    }
}
