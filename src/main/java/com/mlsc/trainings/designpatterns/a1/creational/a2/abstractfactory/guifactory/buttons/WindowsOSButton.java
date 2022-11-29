package com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.buttons;


/**
 * Concreate Product A2
 */
public class WindowsOSButton implements Button{
    @Override
    public void paint() {

        System.out.println("Windows Button");
    }
}
