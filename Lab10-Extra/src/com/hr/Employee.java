package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS - not getter on name, it comes in at creation time so this is an immutable class
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS

    /*
     * OPTION 4: try-catch and throw a different exception at client.
     * NOTE: we will "wrap" the DestinationUnreachableException into a new WorkException
     */
    public void goToWork() throws WorkException {
        // create an instance of Car with all three properties: vin, make, model
        Car c = new Car("abc123", "Toyota", "Tacoma");
        //start, move and stop car.
        try {
            c.start();
            c.moveTo("Tacoma");
        } catch (DestinationUnreachableException e) {
            //insert this exception into a new WorkException and throw that with
            //the DestinationUnreachableException inside it (check WorkException ctors)
            throw new WorkException("Unable to get to work",e); //ctor needs a String and a cause (e)
        }
        finally {
            c.stop();  //we put c.stop() in finally block so it is guaranteed to run
        }
    }
    /*
     * OPTION 3: try-catch, "react in some way," and then re-throw it back at the client.
     */
      /*  public void goToWork() throws DestinationUnreachableException {
        // create an instance of Car with all three properties: vin, make, model
        Car c = new Car("abc123", "Toyota", "Tacoma");
        //start, move and stop car.
        try {
            c.start();
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) { //catch exception and throw it back to client.
            System.out.println("Emailing Lisa Herbold to complain");
            //we don't do throw new exception b/c we are rethrowing the existing exception.  Client will need to
            //deal with it.
            throw e;
        }
        finally {
            c.stop();  //we put c.stop() in finally block so it is guaranteed to run
        }
    }*/

    /*
     *OPTION 2 - "Punt" - DON'T catch the exception at all, just "ignore" it.
     * Since it's a checked exception, we have to add throws and the exception in method signature.
     * BUT now the EmployeeClient will have to either deal with it or punt (punting not a good idea in main()).
     * NOTE: we use a try-finally, to guarantee that c.stop() is always called, but we're still punting b/c
     * there's no catch.
     */

    /*public void goToWork() throws DestinationUnreachableException {
        // create an instance of Car with all three properties: vin, make, model
        Car c = new Car("abc123", "Toyota", "Tacoma");

        try {
            c.start();
            c.moveTo("West Seattle");
        }
        finally {
            c.stop();
        }
    }*/

    /*
     * OPTION 1- try-catch and "handle" the exception in some way, so it stops here
     *  NOTE that we put the call to c.stop() in a finally block, to guarantee that it's called
     */

/*    public void goToWork() {
        // create an instance of Car with all three properties: vin, make, model
        Car c = new Car("abc123", "Toyota", "Tacoma");
        //start, move and stop car.
        try {
            c.start();
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) { //handle exception - e is the exception
            System.out.println(e.getMessage());  //just the reason string from exception
        }
        finally {
            c.stop();  //we put c.stop() in finally block so it is guaranteed to run
        }
    }*/

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}