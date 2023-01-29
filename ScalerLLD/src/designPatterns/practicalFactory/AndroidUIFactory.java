package designPatterns.practicalFactory;

import designPatterns.practicalFactory.component.button.AndroidButton;
import designPatterns.practicalFactory.component.button.Button;
import designPatterns.practicalFactory.component.dropdown.AndroidDropDown;
import designPatterns.practicalFactory.component.dropdown.DropDown;
import designPatterns.practicalFactory.component.menu.AndroidMenu;
import designPatterns.practicalFactory.component.menu.Menu;

public class AndroidUIFactory implements UIFactory {

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
