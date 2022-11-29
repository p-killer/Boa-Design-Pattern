package com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.factories;

import com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.buttons.Button;
import com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.checkboxes.CheckBox;

/**
 * This is the abstract factory
 */
public interface GUIFactory {

    // Product A
    Button createButton();

    // Product B
    CheckBox createCheckbox();

}
