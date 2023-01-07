package designPatterns.factory;

import designPatterns.factory.component.button.Button;
import designPatterns.factory.component.dropdown.DropDown;
import designPatterns.factory.component.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
