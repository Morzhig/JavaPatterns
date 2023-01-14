package Factories;

import Buttons.AndroidButtons;
import Buttons.Button;
import Checkboxes.AndroidCheckbox;
import Checkboxes.Checkbox;

public class AndroidFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new AndroidButtons();
    }

    @Override
    public Checkbox createCheckbox() {
        return new AndroidCheckbox();
    }
}