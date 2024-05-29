package net.people;

import java.time.LocalDate;
import java.time.Period;

record PersonRecord(String name, LocalDate birthDate) {
    //for free, you get the following in the PersonRecord.class file:
    //2 private fields
    //2-arg constructor
    //getters for each, with the "get" prefix omitted, e.g., name() instead of getName()
    //toString()  (toString() method)
    //equals() and hashCode() - more on these later

    public int calcAge(){
        //call our getter birthDate instead of putting the property in directly
        return Period.between(birthDate(), LocalDate.now()).getYears();
    }



    //we can test it out in the terminal with javap to "peak" in person class, using fully qualified name.
    // open up terminal go into out folder and down to Scratch folder and run javap net.people.Person (FQN)
    // or net.people.PersonRecord
    //to see private items, javap -private net.people.Person or javap net.people.PersonRecord
}
