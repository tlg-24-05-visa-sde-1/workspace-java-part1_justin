/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

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
    private Employee[] employees = new Employee[100];  //an array of employees.   One-to-many relationship with Employee;
    //one department object has many employees.
    private int currentIndex = 0;  // for dealing with the array. When we add an employee, it increments by one in addEmployee().

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
        // Note: we don't use for-each here because we only want to access the array where employees were added.
        //the for loop will stop when it gets to currentIndex and not arrive at the null spots.
        // Question: what is in the array for indices where no Employee was added?  null!
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(employees[i]);  // toString() automatically called
        }
    }

    public void workEmployees() {
        for (int i = 0; i < currentIndex; i++) {  //for loop making all employees work.
            employees[i].work();
        }
    }

    public void payEmployees() {
        for (int i = 0; i < currentIndex; i++) {
            employees[i].pay();
        }
    }

    //For all employees that take vacation, make them do that.
    //This would be salaried employees only.  We can't put takeVacation() in the base Employee class b/c not all
    //Employees take vacation.
    public void holidayBreak(){
        for (int i = 0; i < currentIndex; i++) {
            //go through array and ask each index if it's a SalariedEmployee
            //IF employees[i] is actually referring to a SalariedEmployee, we "downcast"
            //the Employee reference to a more specific type of SalariedEmployee.
            //then we can call SalariedEmployee-specific methods like takeVacation().
            //So we ask each slot in employees array if it's an instanceof SalariedEmployee
            //this is possible b/c we can have employee references point to SalariedEmployee objects
            //if it is, we do the downcast.

            if(employees[i] instanceof SalariedEmployee)  //type safe downcast- is the instance really pointing to a SalariedEmployee
                {
                    //example of a downcast-and-method call in one shot.  if we put emloyees[i]. we can see takeVacation()
                  //((SalariedEmployee) employees[i]).takeVacation();

                    //explicitly create a NEW reference fo type SalariedEmployee
                SalariedEmployee semp = (SalariedEmployee) employees[i]; //DOWNCAST to SalariedEmployee if the instance
                //of Employee is refering to a SalariedEmployee then we make DOWNCAST to SalariedEmployee and make them
                //take vacation
                semp.takeVacation();  //and we can access SalariedEmployee methods
            }

        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees[currentIndex++] = emp;
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