package com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.factories;

import com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.buttons.Button;
import com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.buttons.MacOSButton;
import com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.checkboxes.CheckBox;
import com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.checkboxes.MaxOSCheckBox;

/**
 * ConcreteFactory 1
 */
public class MacOSFactory implements  GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MaxOSCheckBox();
    }
}
