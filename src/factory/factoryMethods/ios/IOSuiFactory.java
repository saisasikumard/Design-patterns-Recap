package factory.factoryMethods.ios;

import factory.UIFactory;
import factory.components.button.Button;
import factory.components.button.IOSButton;
import factory.components.dropdown.Dropdown;
import factory.components.menu.Menu;

public class IOSuiFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public Dropdown createDropdown() {
        return null;
    }
}
