package com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.app;

import com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.buttons.Button;
import com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.checkboxes.CheckBox;
import com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.factories.GUIFactory;

public class GUIApplication {

    private Button button;
    private CheckBox checkBox;


    public GUIApplication(GUIFactory guiFactory) {

        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }

}
