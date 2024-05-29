package net.people;

import java.time.LocalDate;

public class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Justin", LocalDate.of(1980, 11, 19));
        PersonRecord p2 = new PersonRecord("Ingrid", LocalDate.of(1979, 11, 05));
        // print : name is age years old
        System.out.printf("%s is %s years old.", p1.getName(), p1.calcAge());

        System.out.printf("%s is %s years old.", p2.name(), p2.calcAge());

        System.out.println();

        System.out.println(p1);
        System.out.println();
        System.out.println(p2);
    }
}
