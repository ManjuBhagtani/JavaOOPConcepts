package designPatterns.practicalFactory;

import designPatterns.practicalFactory.component.button.Button;
import designPatterns.practicalFactory.component.dropdown.DropDown;
import designPatterns.practicalFactory.component.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.IOS);
        UIFactory factory = flutter.createUIFacory();
        Menu menu = factory.createMenu();
        Button button = factory.createButton();
        DropDown dropDown = factory.createDropDown();
    }
}
