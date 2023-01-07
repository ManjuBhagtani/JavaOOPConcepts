package designPatterns.factory;

import designPatterns.factory.component.button.Button;
import designPatterns.factory.component.button.IosButton;
import designPatterns.factory.component.dropdown.DropDown;
import designPatterns.factory.component.dropdown.IosDropDown;
import designPatterns.factory.component.menu.IosMenu;
import designPatterns.factory.component.menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }
}
