package com.mlsc.trainings.designpatterns.a1.creational.a4.singleton;

public class ServiceLocator2 {

    private ServiceLocator2() {
        System.out.println("The singleton has been instantiated....");
    }

    static {
        System.out.println("ServiceLocator2 class is loaded");
    }

    /**
     * Even multiple threads enter this function
     * exactly at same point in time
     * @return
     */
    public static ServiceLocator2 getInstance() {
        return SingletonHolder.me;
    }


    private static class SingletonHolder {
        static {
            System.out.println("SingletonHolder class is loaded....");
        }

        private static ServiceLocator2 me = new ServiceLocator2();
    }


}
