package Factories;

import Buttons.Button;
import Buttons.WindowsButtons;
import Checkboxes.Checkbox;
import Checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButtons();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}