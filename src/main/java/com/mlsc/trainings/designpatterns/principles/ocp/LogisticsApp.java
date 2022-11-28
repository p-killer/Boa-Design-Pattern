package com.mlsc.trainings.designpatterns.principles.ocp;

public class LogisticsApp {

    public static void main(String[] args) {
        Order order = new Order();
        order.setShippingType(new Air());
        long cost = order.getShippingCost();
        System.out.println(cost);

    }
}
