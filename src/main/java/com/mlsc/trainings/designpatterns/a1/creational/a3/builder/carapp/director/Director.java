package com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.director;


import com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.builders.Builder;

public class Director {


    /**
     * 2 seats
     * CarType : Sports Car
     * Engine write some method in the engine class which will take different values for its parameters
     * based on card type
     * Transmission :
     * tripComputer
     * GPS Navigator
     *
     * @param builder
     */
    public void constructSportsCar(Builder builder) {


    }


    /**
     * 4 seats
     * CarType : City Car
     * Engine write some method in the engine class which will take different values for its parameters
     * based on card type
     * Transmission :
     * tripComputer
     * GPS Navigator
     *
     * @param builder
     */
    public void constructCityCar(Builder builder) {


    }

    public void constructSUVCar(Builder builder) {


    }


}
