package Factory.Components.Button;

public class AndroidButton implements Button{
    @Override
    public void showButton() {
        System.out.println("showing android button");
    }

    @Override
    public void clickButton() {
        System.out.println("clicking android button");
    }
}
