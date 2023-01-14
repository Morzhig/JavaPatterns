package Application;

import Buttons.Button;
import Checkboxes.Checkbox;
import Factories.GUIFactory;

public class App {
    private final Button button;
    private final Checkbox checkbox;

    public App (GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}