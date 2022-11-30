package com.mlsc.trainings.designpatterns.a2.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Entity {

    List<Entity> children = new ArrayList<>();


    public void addProduct(Entity entity) {
        children.add(entity);
    }


    @Override
    public int getCost() {
//        int cost = 0;
//        for (Entity e : children) {
//            cost = cost + e.getCost();
//        }

        int cost = children
                .stream()
                .mapToInt(x -> x.getCost())
                .sum();
        return cost;


    }
}
