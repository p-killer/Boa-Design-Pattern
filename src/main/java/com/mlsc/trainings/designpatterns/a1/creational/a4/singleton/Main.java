package com.mlsc.trainings.designpatterns.a1.creational.a4.singleton;

public class Main {

    public static void main(String[] args) {


        ServiceLocator2 s1 = ServiceLocator2.getInstance();
        ServiceLocator2 s2 = ServiceLocator2.getInstance();
        ServiceLocator2 s3 = ServiceLocator2.getInstance();
        ServiceLocator2 s4 = ServiceLocator2.getInstance();
        ServiceLocator2 s5 = ServiceLocator2.getInstance();
        ServiceLocator2 s6 = ServiceLocator2.getInstance();
        ServiceLocator2 s7 = ServiceLocator2.getInstance();


        System.out.println(s1 == s2);
        System.out.println(s1 + " -- " + s2 + " -- " + s2);


    }
}
