package copy_constructor;

import java.util.Arrays;

/**
 * Represents a person with their name, nationality, date of birth, passport
 * details, and seat number.
 */
public class Person {
    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;

    /**
     * Constructs a new Person object with the given attributes.
     *
     * @param name        The name of the person
     * @param nationality The nationality of the person
     * @param dateOfBirth The date of birth of the person
     * @param seatNumber  The seat number of the person
     */
    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        // set fields equal to parameters here.
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[] { this.name, this.dateOfBirth, this.nationality };

    }

    /**
     * Creates a new Person object by copying the attributes from another Person
     * object.
     *
     * @param src The Person object to copy from
     */
    // copy constructor

    public Person(Person src) {
        this.name = src.name;
        this.nationality = src.nationality;
        this.dateOfBirth = src.dateOfBirth;
        this.passport = src.passport;
        this.seatNumber = src.seatNumber;
    }

    public static void main(String[] args) {
        /**
         * Creates a new Person object with the specified attributes.
         *
         * @param name        The name of the person.
         * @param nationality The nationality of the person.
         * @param dateOfBirth The date of birth of the person in the format
         *                    "MM/DD/YYYY".
         * @param height      The height of the person in feet.
         * @return A new Person object with the specified attributes.
         */
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);

        /**
         * Creates a new Person object that is a twin of the given person.
         * The twin has the same attributes as the original person, except for the name
         * and seat number.
         *
         * @param person The original person object
         * @return The twin person object with modified name and seat number
         */
        Person twin = new Person(person);
        twin.name = "Jad Slim";
        twin.seatNumber = 4;

        System.out.println("The details about the person:");
        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);

        System.out.println("The details about the person:");
        System.out.println(twin.name);
        System.out.println(twin.nationality);
        System.out.println(twin.dateOfBirth);
        System.out.println(Arrays.toString(twin.passport));
        System.out.println(twin.seatNumber);

    }
}
