package com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory;

import com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.app.GUIApplication;
import com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.factories.GUIFactory;
import com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.factories.MacOSFactory;
import com.mlsc.trainings.designpatterns.a1.creational.a2.abstractfactory.guifactory.factories.WindowsOSFactory;

public class DemoClient {


    public static void main(String[] args) {



        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsOSFactory();
        }

        GUIApplication application  = new GUIApplication(factory);
        application.paint();

    }
}
