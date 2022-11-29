package com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp;

import com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.builders.CarBuilder;
import com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.cars.Car;
import com.mlsc.trainings.designpatterns.a1.creational.a3.builder.carapp.director.Director;

public class Demo {

    public static void main(String[] args) {

        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();


    }
}
