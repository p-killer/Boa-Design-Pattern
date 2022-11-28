package com.mlsc.trainings.designpatterns.principles.ocp;

public class Ground implements Shipping {
    @Override
    public long getCost(Order order) {

        /**
         * Ground shipping logic
         */
        return 99;
    }
}
