package com.mlsc.trainings.designpatterns.a2.structural.bridge;

/**
 * <p>The Device classes act as the implementation, whereas the Remote s act as the abstraction.</p>
 *
 * <p>The base remote control class declares a reference field that links it with a device object. All remotes work with the devices via the general device interface, which lets the same remote support multiple device types.
 * </p>
 * <p>
 * You can develop the remote control classes independently from the device classes. All that’s needed is to create a new remote subclass. For example, a basic remote control might only have two buttons, but you could extend it with additional features, such as an extra battery or a touchscreen.
 * </p>
 */
public class Problem {



}
