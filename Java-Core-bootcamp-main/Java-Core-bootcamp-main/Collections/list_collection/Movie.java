public class Movie {

    private String name;
    private String format;
    private double rating;

    /**
     * Constructs a Movie object with the given name, format, and rating.
     *
     * @param name   The name of the movie.
     * @param format The format of the movie (e.g., DVD, Blu-ray).
     * @param rating The rating of the movie.
     */
    public Movie(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    /**
     * Constructs a new Movie object by copying the properties from another Movie
     * object.
     *
     * @param source The Movie object to copy from
     */
    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    /**
     * Gets the name of the entity.
     *
     * @return The name of the entity.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the object.
     *
     * @param name The new name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public double getRating() {
        return rating;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }

}
