/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);  //toString() automatically called

        // add Employees to it-  we had to change to SalariedEmployee and HourlyEmployee because we made Employee an abstract class
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 60_000));  //slot 0 in employee array
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 24.00, 40.0));   //slot 1 in employee array

        //add a SalariedEmployee and an HourlyEmployee
        dept.addEmployee(new SalariedEmployee("Justin", LocalDate.of(2024, 05, 07), 70_000));
        dept.addEmployee(new HourlyEmployee("Bob", LocalDate.of(2024, 03, 01 ), 33.66, 40.0));

        //add an Executive, the Executive will takeVacation too b/c it IS-A SalariedEmployee
        dept.addEmployee(new Executive("Jacobo", LocalDate.of(2024, 02, 16), 1_500_000.0));

        // list its Employees - example of polymorphism- three different responses
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        //pay Employees - also an example of polymorhpism- three different responses again, but pay() in Employee is still an issue
        System.out.println("\nPay employees: ");
        dept.payEmployees();

        //make SalariedEmployees takeVacation() for Holiday break
        System.out.println("\nHoliday break: ");
        dept.holidayBreak();
    }
}