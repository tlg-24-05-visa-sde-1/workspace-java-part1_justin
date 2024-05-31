package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;
import com.transportation.DestinationUnreachableException;

public class EmployeeClient {

    public static void main(String[] args) {
        // create an instance of Employee
        Employee emp = new Employee("Justin");

        // call goToWork() on the Employee object
        try {
            emp.goToWork();
        } catch (WorkException e) { //make sure we're catching the right exception
            System.out.println(e.getMessage());
            System.out.println(e.getCause()); //extracts the nested cause (what we put in the WorkException)
            System.out.println();
            e.printStackTrace();  //prints the sequence of calls (root cause of problem is at top)
        }

    }
}