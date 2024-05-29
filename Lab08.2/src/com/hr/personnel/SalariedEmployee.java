package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    //properties
    double salary;

    //constructors

    //no-arg constructor
    public SalariedEmployee() {
        super();
    }

    //2-arg constructor
    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);  //delegate to superclass ctor, which handles name, hireDate
    }

    //3-arg constructor
    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        //better as a safety precaution to use this(name, hireDate) instead here instead of super(name, hireDate);
        this(name, hireDate); //delegate to neighboring ctor, which handles name, hireDate
        setSalary(salary); //setSalary() myself by delegating to its setter
    }

    //business or actions-oriented methods
    //overrides method in Employee super class
    @Override
    public void pay(){
        System.out.println(getName() + " is paid a salary $" + getSalary());
    }
    //this is only for SalariedEmployees, so we put it here instead of Employee b/c it's not something in common b/w all Employees
    public void takeVacation(){
        System.out.println(getName()+ " is on vacation.");
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
//        return getClass().getSimpleName() + ": name: " + getName() + ", hireDate: " + getHireDate() + " , salary: $" + getSalary();
        //we use super.toString() to get the toString from the super class and add to it.
        return super.toString() + " , salary: $" + getSalary();
    }
}
