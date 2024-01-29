package oop_basics;

// basics of OOP 
import java.util.Arrays;

public class Person {
    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;

    public static void main(String[] args) {

        // initialising the object and their fields
        Person person = new Person();
        person.name = "rohan";
        person.nationality = "Indian";
        person.dateOfBirth = "01-01-2002";
        person.passport = new String[] { person.name, person.nationality, person.dateOfBirth };
        person.seatNumber = 100;

        // Printing the object details
        System.out.println("The details about the person:");
        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);

    }
}
