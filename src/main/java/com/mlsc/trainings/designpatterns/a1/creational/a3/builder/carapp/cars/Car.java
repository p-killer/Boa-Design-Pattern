package com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.cars;

import com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.components.Engine;
import com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.components.GPSNavigator;
import com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.components.Transmission;
import com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.components.TripComputer;
import lombok.Data;


@Data
public class Car {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }


}
