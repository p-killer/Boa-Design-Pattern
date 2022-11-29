package com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.factories;

import com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.buttons.Button;
import com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.buttons.WindowsOSButton;
import com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.checkboxes.CheckBox;
import com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.checkboxes.WindowsOSCheckBox;


/**
 * ConcreteFactory 2
 */
public class WindowsOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsOSButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsOSCheckBox();
    }
}
