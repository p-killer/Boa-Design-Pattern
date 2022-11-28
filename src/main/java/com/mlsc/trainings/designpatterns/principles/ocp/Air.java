package com.mlsc.trainings.designpatterns.principles.ocp;

public class Air implements Shipping {
    @Override
    public long getCost(Order order) {
        /**
         * Specific to Air shippment
         */
        return 100;
    }
}
