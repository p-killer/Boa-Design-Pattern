package com.mlsc.trainings.designpatterns.a2.structural.bridge;

import com.mlsc.trainings.designpatterns.a2.structural.bridge.devices.Device;
import com.mlsc.trainings.designpatterns.a2.structural.bridge.devices.Radio;
import com.mlsc.trainings.designpatterns.a2.structural.bridge.devices.TV;
import com.mlsc.trainings.designpatterns.a2.structural.bridge.remotes.AdvanceRemote;
import com.mlsc.trainings.designpatterns.a2.structural.bridge.remotes.BasicRemote;

public class Demo {

    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvanceRemote advancedRemote = new AdvanceRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
