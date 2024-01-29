package constructors_basics;

// basics of OOP 
import java.util.Arrays;

/*
 * Represents a person with their personal details and seat number.
 */
public class Person {
    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        // set fields equal to parameters here.
        /*
         * Initializes a new Passenger object with the given name, nationality, date of
         * birth, and seat number.
         * Also creates a passport array containing the passenger's name, date of birth,
         * and nationality.
         *
         * @param name The name of the passenger
         * 
         * @param nationality The nationality of the passenger
         * 
         * @param dateOfBirth The date of birth of the passenger
         * 
         * @param seatNumber The seat number of the passenger
         */
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[] { this.name, this.dateOfBirth, this.nationality };

    }

    public static void main(String[] args) {

        Person person = new Person("rohan", "Indian", "01-01-2002", 100);

        // Printing the object details
        System.out.println("The details about the person:");
        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);

    }
}