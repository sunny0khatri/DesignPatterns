package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Dropdown.Dropdown;
import Factory.Components.Menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter=new Flutter();
        UIFactory uiFactory=flutter.getUIFactory(SupportedPlatforms.ANDROID);
        Button button= uiFactory.createButton();
        button.clickButton();
        Menu menu=uiFactory.createMenu();
        menu.showMenu();
        Dropdown dropdown=uiFactory.createDropdown();
        dropdown.showDropdown();
        System.out.println("Debug");
    }
}
