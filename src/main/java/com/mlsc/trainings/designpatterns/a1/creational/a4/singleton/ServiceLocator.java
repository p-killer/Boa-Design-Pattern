package com.mlsc.trainings.designpatterns.a1.creational.a4.singleton;


/**
 * This will fail in Java 1.4
 */
public class ServiceLocator {


    private static volatile ServiceLocator me =  null;

    /**
     *
     */
    private ServiceLocator() {

        /**
         * initialization
         */


    }


    /**
     * DCL : Double-Checked Locking
     *
     * @return
     */

    // read barrier
    public static ServiceLocator getInstance() {

        ServiceLocator result = me;
        if (result != null) {
            return result;
        }

        synchronized (ServiceLocator.class) {
            if (me == null) {
                me = new ServiceLocator();
            }
            return me;
        }

    }
    // write barrier

}
