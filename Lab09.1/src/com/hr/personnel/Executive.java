package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {

    public static final double STANDARD_DEDUCTION = 100_000_0;
    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    //business methods
    //override work() inherited from Employee.  Write work() method with the same signature as in Employee
    @Override
    public void work() {
        System.out.println(getName() + " enjoying a nice round of golf");
    }

    //OPT-IN to override fileReturn() to do it differently
    @Override // from Interface TaxPayer
    public void fileReturn(){
        System.out.println("Return filed electronically");
    }

    @Override // overrides Salaried Employee
    public double getStandardDeduction(){
        return STANDARD_DEDUCTION;
    }
}
