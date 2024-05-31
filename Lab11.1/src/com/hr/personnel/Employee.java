/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

/**
 * The Employee class is fairly simple, serving as a superclass to illustrate inheritance.
 *
 * Properties:
 *   String name
 *   LocalDate hireDate
 *
 * Methods (excluding get/set methods):
 *   void work()        simulates work by printing a message to show it was called.
 *   String toString()  self-explanatory.
 */

//you can't have a direct instance of an abstract class
public abstract class Employee implements TaxPayer {
    // fields
    private String name;
    private LocalDate hireDate;

    // constructors
    public Employee() {
        //there is a call to forced super() here
    }

    public Employee(String name, LocalDate hireDate) {
        //there's a forced call to super() here
        setName(name);
        setHireDate(hireDate);
    }

    // business methods
    //"all employees work" -> they have this behavior in common, so weork() must go here
    //AND they all do it the same way, they work "hard", so we code it here, too.
    public void work() {
        System.out.println(getName() + " working hard since " + getHireDate());
    }

    //we have to add a pay() method here because Department class only knows about employees.
    //we then override the pay() method in both HourlyEmployee and SalariedEmployee
    //pay MUST go here because all employees have this in common
    //the problem is we can't really implement here, to come up with a $$ figure b/c we only have
    //name and hireDate here.

    //We need a way to say "all employees get paid",but we can't implement it here.
    //So here we say THAT all employees get paid, but don't say how and refer it to subclasses.
    //we do that with the work abstract, and we have to make the class abstract too.
    //this means we can't have direct instances of Employee now, we'll have to instantiate with subclass ctors.

    public abstract void pay();


    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        //getClass() is an inherited method from Object class.  We can use getClass().getName() or .getSimpleName().
        return getClass().getSimpleName() + ": name=" + getName() + ", hireDate=" + getHireDate();
    }
}