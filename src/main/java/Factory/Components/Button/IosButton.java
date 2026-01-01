package Factory.Components.Button;

public class IosButton implements Button{
    @Override
    public void showButton() {
        System.out.println("showing ios button");
    }

    @Override
    public void clickButton() {
        System.out.println("clicking ios button");
    }
}
