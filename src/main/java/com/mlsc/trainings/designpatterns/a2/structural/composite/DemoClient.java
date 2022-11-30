package com.mlsc.trainings.designpatterns.a2.structural.composite;

public class DemoClient {

    public static void main(String[] args) {


        Box fedExBox = new Box();
        Box hammerBox = new Box();
        hammerBox.addProduct(new Product("Hammer", 100));
        fedExBox.addProduct(hammerBox);

        Box b2 = new Box();


        Box b3 = new Box();
        b3.addProduct(new Product("iPhone", 1500));
        b3.addProduct(new Product("HeadPhones", 500));
        b2.addProduct(b3);

        Box b5 = new Box();
        b5.addProduct(new Product("Charger", 200));
        b2.addProduct(b5);

        fedExBox.addProduct(b3);
        fedExBox.addProduct(b5);

        fedExBox.addProduct(new Product("Document", 10));

        int totalCost = fedExBox.getCost();
        System.out.println(totalCost);

    }
}
