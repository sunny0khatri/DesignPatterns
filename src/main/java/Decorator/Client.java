package Decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream=new ChocoCone();
        iceCream=new StrawberryScoop(iceCream);
        iceCream=new VanillaScoop(iceCream);
        iceCream=new StrawberryScoop(iceCream);
        iceCream=new ChocoChips(iceCream);

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}
