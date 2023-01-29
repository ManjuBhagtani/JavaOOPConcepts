package designPatterns.practicalFactory;

import designPatterns.practicalFactory.component.button.Button;
import designPatterns.practicalFactory.component.button.IosButton;
import designPatterns.practicalFactory.component.dropdown.DropDown;
import designPatterns.practicalFactory.component.dropdown.IosDropDown;
import designPatterns.practicalFactory.component.menu.IosMenu;
import designPatterns.practicalFactory.component.menu.Menu;

public class IosUIFactory implements UIFactory {
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
