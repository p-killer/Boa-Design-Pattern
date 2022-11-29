package com.mlsc.trainings.designpatterns.a1.creational.a1.factory.logistics;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * <p>
 * Imagine that you’re creating a logistics management application.
 * The first version of your app can only handle transportation by trucks,
 * so the bulk of your code lives inside the Truck
 * class.
 * </p>
 * <p>
 * After a while, your app becomes pretty popular.
 * Each day you receive dozens of requests from sea transportation companies to
 * incorporate sea logistics into the app.
 * </p>
 * <p>
 * There is an issue here :
 * At present, most of your code is coupled to the Truck class. Adding Ships into the app would require making changes to the entire codebase. Moreover, if later you decide to add another type of transportation to the app, you will probably need to make all of these changes again.
 * </p>
 * <p>
 * As a result, you will end up with pretty nasty code,
 * riddled with conditionals that switch the app’s behavior depending on
 * the class of transportation objects.
 * </p>
 *
 * <p><b>Find the solution !</b></p>
 */

public class ProblemStatement {

    public static void main(String[] args) throws Exception{

        Connection con = DriverManager.getConnection("");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("");

    }


}
