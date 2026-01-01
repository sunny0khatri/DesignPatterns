package Factory;

public class Flutter {

    //Non-factory method
    public void setTheme(){
        System.out.println("Setting Theme");
    }

    //Non-factory method
    public void refreshUI(){
        System.out.println("Refreshing UI");
    }

    public UIFactory getUIFactory(SupportedPlatforms platforms){
        return UIFactoryFactory.getUIFactory(platforms);
    }
}
