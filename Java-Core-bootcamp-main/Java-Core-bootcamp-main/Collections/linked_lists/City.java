package Collections.linked_lists;

/**
 * Represents a city with a name and population.
 */
public class City {
    String city;
    String Country;

    public City(String city, String Country) {
        this.city = city;
        this.Country = Country;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    @Override
    public String toString() {
        return "{" +
                " city='" + getCity() + "'" +
                ", Country='" + getCountry() + "'" +
                "}";
    }

}