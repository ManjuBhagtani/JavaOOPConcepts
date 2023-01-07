package designPatterns.factory;

import designPatterns.factory.component.button.Button;
import designPatterns.factory.component.dropdown.DropDown;
import designPatterns.factory.component.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.IOS);
        UIFactory factory = flutter.createUIFacory();
        Menu menu = factory.createMenu();
        Button button = factory.createButton();
        DropDown dropDown = factory.createDropDown();
    }
}
