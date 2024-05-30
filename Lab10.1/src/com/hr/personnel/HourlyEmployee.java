/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    // fields
    private double rate;
    private double hours;
    public static final double FEDERAL_MINIMUM_WAGE = 15.0;

    // constructors
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);  // delegate to superclass ctor for name, hireDate
    }

    public HourlyEmployee (String name, LocalDate hireDate, double rate, double hours)
            throws IllegalArgumentException {  //throws an exception b/c of using setRate() method
        this(name, hireDate);   // delegate to neighboring ctor for name, hireDate
        setRate(rate);          // handle rate here, by delegating to setter  //setRate() throws exception if a bad rate is entered
        setHours(hours);        // handle hours here, by delegating to setter
    }

    // business methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid hourly " + (getRate() * getHours()));
    }

    @Override  // interface TaxPayer
    public void payTaxes() {
        double taxes = getRate() * getHours() * HOURLY_TAX_RATE;
        System.out.println(getName() + " paid taxes of " + taxes);
    }

    // accessor methods
    public double getRate() {
        return rate;
    }

    //We throw an exception if the wage is below the Fed. min., announce we're doing it in the method
    //signature, and provide a message when we throw it.  We should also announce this where ever we use the method.
    public void setRate(double rate) throws IllegalArgumentException {
        if (rate < FEDERAL_MINIMUM_WAGE) { //invalid -> throw exception
            throw new IllegalArgumentException("Illegal wage " + rate + ". Federal minimum wage is " + FEDERAL_MINIMUM_WAGE);
        } else {                            //valid -> assign to field
            this.rate = rate;
        }
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() + ", rate=" + getRate() + ", hours=" + getHours();
    }
}