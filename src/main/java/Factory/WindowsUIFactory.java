package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Button.WindowsButton;
import Factory.Components.Dropdown.Dropdown;
import Factory.Components.Dropdown.WindowsDropdown;
import Factory.Components.Menu.Menu;
import Factory.Components.Menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new WindowsDropdown();
    }
}
