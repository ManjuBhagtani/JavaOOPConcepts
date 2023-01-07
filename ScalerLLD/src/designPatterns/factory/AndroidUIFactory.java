package designPatterns.factory;

import designPatterns.factory.component.button.AndroidButton;
import designPatterns.factory.component.button.Button;
import designPatterns.factory.component.dropdown.AndroidDropDown;
import designPatterns.factory.component.dropdown.DropDown;
import designPatterns.factory.component.menu.AndroidMenu;
import designPatterns.factory.component.menu.Menu;

public class AndroidUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
