package com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.builders;

import com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.cars.Car;
import com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.cars.CarType;
import com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.components.Engine;
import com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.components.GPSNavigator;
import com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.components.Transmission;
import com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.components.TripComputer;
import lombok.Data;

@Data
public class CarBuilder implements Builder {

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public Car getResult() {

        return new Car(this.carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
