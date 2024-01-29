import java.util.ArrayList;
import java.util.List;

/**
 * Represents a store that contains a list of movies.
 */
public class Store {

    /**
     * The list of movies.
     */
    private List<Movie> movies;

    /**
     * Constructs a new instance of the Store class.
     * Initializes the movies list as an empty ArrayList.
     */
    public Store() {
        this.movies = new ArrayList<>();
    }

    /**
     * Retrieves a movie from the list of movies based on the given index.
     *
     * @param index The index of the movie to retrieve.
     * @return The movie at the specified index.
     */
    public Movie getMovie(int index) {
        return new Movie(movies.get(index));
    }

    /**
     * Sets the movie at the specified index in the list of movies.
     *
     * @param index The index of the movie to set
     * @param movie The movie object to set at the specified index
     */
    public void setMovie(int index, Movie movie) {
        this.movies.set(index, new Movie(movie));
    }

    /**
     * Adds a movie to the collection of movies.
     *
     * @param movie The movie to be added.
     */
    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
    }

    /**
     * Returns a string representation of the object.
     *
     * @return A string representation of the movies in the collection, each on a
     *         new line.
     */
    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}