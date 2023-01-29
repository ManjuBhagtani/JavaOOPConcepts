package designPatterns.practicalFactory;

import designPatterns.practicalFactory.component.button.Button;
import designPatterns.practicalFactory.component.dropdown.DropDown;
import designPatterns.practicalFactory.component.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
