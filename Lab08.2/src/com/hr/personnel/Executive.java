package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {
    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    //business methods
    //override work() inherited from Employee.  Write work() method with the same signature as in Employee
    @Override
    public void work() {
        System.out.println(getName() + " enjoying a nice round of golf");
    }
}
