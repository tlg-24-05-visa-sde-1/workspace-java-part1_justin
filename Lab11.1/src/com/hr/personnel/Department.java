/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Department class manages employees.
 * <p>
 * Properties:
 * String name
 * String location
 * Employee[] employees  the Employees in this department.
 * int currentIndex      internal counter for number of employees in the department.
 * <p>
 * Methods (excluding get/set methods):
 * void listEmployees()  print info on all employees in the department.
 * void workEmployees()  make all employees in the department work.
 * String toString()     self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;
    private final Collection<Employee> employees = new ArrayList<>();

    // constructors
    public Department() {
        //this call to super() is there whether or not you include it.  A super() class constructor must be called
        super();
    }

    public Department(String name, String location) {
        super();
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        //we replaced for loop with a for each look over the ArrayList of Employees.
        for (Employee emp : employees) {
            System.out.println(emp);  // toString() automatically called
        }
    }

    public void workEmployees() {
        for (Employee emp : employees) {  //for each loop making all employees work.
            emp.work();
        }
    }

    public void payEmployees() {
        for (Employee emp : employees) {
            emp.pay();
        }
    }

    //For all employees that take vacation, make them do that.
    //This would be salaried employees only.  We can't put takeVacation() in the base Employee class b/c not all
    //Employees take vacation.
    public void holidayBreak(){
        for (Employee emp : employees) {
            //go through array and ask each index if it's a SalariedEmployee
            //IF emp is actually referring to a SalariedEmployee, we "downcast"
            //the Employee reference to a more specific type of SalariedEmployee.
            //then we can call SalariedEmployee-specific methods like takeVacation().
            //So we ask each slot in employees array if it's an instanceof SalariedEmployee
            //this is possible b/c we can have employee references point to SalariedEmployee objects
            //if it is, we do the downcast.

            if(emp instanceof SalariedEmployee)  //type safe downcast- is the instance really pointing to a SalariedEmployee
                {
                    //example of a downcast-and-method call in one shot.  if we put emloyees[i]. we can see takeVacation()
                  //((SalariedEmployee) employees[i]).takeVacation();

                    //explicitly create a NEW reference fo type SalariedEmployee
                SalariedEmployee semp = (SalariedEmployee) emp; //DOWNCAST to SalariedEmployee if the instance
                //of Employee is refering to a SalariedEmployee then we make DOWNCAST to SalariedEmployee and make them
                //take vacation
                semp.takeVacation();  //and we can access SalariedEmployee methods
            }

        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees.add(emp);  //add an Employee to array
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ ": name=" + getName() + ", location=" + getLocation();
    }
}