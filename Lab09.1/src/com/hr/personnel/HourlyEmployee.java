package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;
        //we don't have to write implements TaxPayer here now b/c we did it in Employee and HourlyEmployee
//IS-A Employee
public class HourlyEmployee extends Employee {
    //properties
    double rate;
    double hours;

    //constructors

    //no-arg constructor
    public HourlyEmployee() {
        super();
    }
    //2-arg constructor
    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate); //delegate to superclass ctor
    }

    //4-arg constructor
    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);  //delegate to neighboring 2-arg ctor
        setHours(hours);  //handle these myself with their setters
        setRate(rate);
    }

    //business or "action" methods
    //overrides method in Employee super class
    @Override
    public void pay(){
        System.out.println(getName() + " is paid a weekly total of $" + (getRate()*getHours()));
    }

    //payTaxes() method is needed b/c SalariedEmployee implements the TaxPayer interface
    @Override  //interface TaxPayer
    public void payTaxes(){
        System.out.println(getName() + " paid taxes of " + getRate()*getHours()*HOURLY_TAX_RATE);
    }

    //getters/setters
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }


    //toString()
    @Override
    public String toString(){
//        return getClass().getSimpleName() ": name: " + getName() + ", hireDate: " + getHireDate() + " , rate: $" + getRate() + " hours: " + getHours();
        //we use super.toString() to get the toString from the super class and add to it.
        return super.toString() + " , rate: $" + getRate() + " hours: " + getHours();
    }
}
