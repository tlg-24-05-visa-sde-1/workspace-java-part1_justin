package net.people;

import java.time.LocalDate;
import java.time.Period;

/*
 * Immutable class.  More accurately, this is a class definition written in such a way
 * that instances of it, once created, cannot have their properties changed.  There are simply no public methods available
 * to do this.
 * DATA comes in at birth, when created with new (contructor), then the data can't be changed.
 */
//remember theses are effectively final already b/c there aren't setters
public class Person {
    private final String name;
    private final LocalDate birthDate;

    //constructors
    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

  /*
   * Method that returns the person's age in whole years.
   * HINT: this is the period of time b/w birthDate and today's date, in whole years.
   *
   * This is called a "derived" property, i.e., its value can be "calculated" or derived from the
   * existing fields that we have.  It is also an immutable class b/c there are no setters.
   */

    public int calcAge(){
        //Period is a static method and returns stuff (MAKES it)
     Period age = Period.between(birthDate, LocalDate.now());
     //the Period getYears() method lets us return an int, so we call it on the Period instance we made, age.
     return age.getYears();

     //same done in one line
     //return Period.between(getBirthDate(), LocalDate.now()).getYears();
    }


    //getters no setters
    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("net.people.Person: name= %s, birthDate= %s", getName(), getBirthDate());
    }

}
