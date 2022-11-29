package com.mlsc.trainings.designpatterns.relationships;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassA invokes the service on ClassB : ClassA is the client & ClassB is the supplier
 */
public class SalaryApp {


    int id;
    String name;


//    public void demo(ArrayList<Employee> emps) {
    public void demo(AbstractList<Employee> emps) {

        List<Employee> allEmps = new ArrayList<>();

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        allEmps.add(e1);
        allEmps.add(e2);
        allEmps.add(e3);

        List<Employee> filteredEmps = new ArrayList<>();


        filteredEmps.add(e1);
        filteredEmps.add(e2);

    }


    // 1 way of doing it : Visibility of the supplier to the client is [Field]
//    Employee employee = null;


    // Visibility of the supplier to the client is [Parameter]
//    public void printSalarySlip(Employee employee) {
//        employee.getType();
//
//    }

    // Visibility of the supplier to the client is [Local]
//    public void printSalarySlip() {
//        Employee employee = null;
//        employee.getType();
//    }

    // Visibility of the supplier to the client is [Global]
    public void printSalarySlip() {
        SalaryGlobals.employee.getType();
    }
}
