package com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.buttons;


/**
 * Concrete Product A1
 */
public class MacOSButton implements  Button {
    @Override
    public void paint() {
        System.out.println("Mac Button is painted...");
    }
}
