import java.util.Scanner;

public class Main {

    /**
     * Creates a new instance of the Store class and assigns it to the static
     * variable 'store'.
     */
    static Store store = new Store();

    public static void main(String[] args) {
        /**
         * An array of Movie objects representing a collection of movies.
         * Each movie object contains information such as the title, format, and rating.
         * 
         * @param movies An array of Movie objects
         * @return The array of Movie objects representing a collection of movies
         */
        Movie[] movies = new Movie[] {
                new Movie("The Shawshank Redemption", "BlueRay", 9.2),
                new Movie("The Godfather", "BlueRay", 9.1),
                new Movie("The Godfather: Part II", "DVD", 9.0),
                new Movie("12 Angry Men", "DVD", 8.9),
                new Movie("The Dark Knight", "BlueRay", 9.0),
                new Movie("Schindler's List", "DVD", 8.9),
                new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
                new Movie("Pulp Fiction", "DVD", 8.8),
                new Movie("The Good, the Bad and the Ugly", "DVD", 8.8),
                new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };

        /**
         * Adds a list of movies to the store.
         *
         * @param movies The list of movies to add.
         */
        for (Movie movie : movies) {
            store.addMovie(movie);
        }

        printStore();
        userInput();

    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);

        String status = "continue";
        /**
         * Allows the user to continuously edit the ratings of movies in the store.
         * The user is prompted to choose an integer between 0 - 9, and then set a new
         * rating for the corresponding movie.
         * The updated movie is then stored back in the store.
         * The store is printed after each rating update.
         * The loop continues until the user enters "continue" to edit another rating.
         */
        while (status.equals("continue")) {
            System.out.print("\nPlease choose an integer between 0 - 9: ");
            int choice = scanner.nextInt();
            Movie movie = store.getMovie(choice);
            System.out.print("Set a new rating for " + movie.getName() + ": ");
            double rating = scanner.nextDouble();
            movie.setRating(rating);
            store.setMovie(choice, movie);
            printStore();
            System.out.print("To edit another rating, type: 'continue': ");
            status = scanner.next();
        }
        scanner.close();
    }

    public static void printStore() {
        System.out.println("********************************MOVIE STORE*******************************");
        System.out.println(store);
    }

}
