public class Main {

    public static void main(String[] args) {
        /**
         * Creates a new Person object with the given information and prints out the
         * details.
         *
         * @param name        The name of the person
         * @param nationality The nationality of the person
         * @param dateOfBirth The date of birth of the person
         * @param seatNumber  The seat number of the person
         */
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);

        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n"
                + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

    }

}
