package Factory;

public class UIFactoryFactory {

    public static UIFactory getUIFactory(SupportedPlatforms platforms){
        if(platforms.equals(SupportedPlatforms.ANDROID))
            return new AndroidUIFactory();
        if(platforms.equals(SupportedPlatforms.IOS))
            return new IosUIFactory();
        if(platforms.equals(SupportedPlatforms.WINDOWS))
            return new WindowsUIFactory();
        return null;
    }

}
