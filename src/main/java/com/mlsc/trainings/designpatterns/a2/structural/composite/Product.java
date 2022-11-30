package com.mlsc.trainings.designpatterns.a2.structural.composite;

public class Product implements Entity {


    private int cost;
    private String name;

    public Product(String name, int cost) {

        this.name = name;
        this.cost = cost;

    }

    @Override
    public int getCost() {
        return this.cost;
    }
}
