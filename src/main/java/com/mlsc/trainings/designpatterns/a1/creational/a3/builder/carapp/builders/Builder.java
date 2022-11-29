package com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.builders;

import com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.cars.CarType;
import com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.components.Engine;
import com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.components.GPSNavigator;
import com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.components.Transmission;
import com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.components.TripComputer;

public interface Builder {

    void setCarType(CarType carType);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGpsNavigator(GPSNavigator gpsNavigator);


}
