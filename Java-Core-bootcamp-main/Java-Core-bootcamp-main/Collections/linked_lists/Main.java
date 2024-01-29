
package Collections.linked_lists;

import java.util.LinkedList;
import java.util.List;

public class Main {

    /**
     * This program demonstrates the usage of a LinkedList to store City objects.
     * It creates a list of cities and performs some operations on it.
     */
    public static void main(String[] args) {

        /**
         * Creates a new linked list to store City objects.
         *
         * @return A new linked list to store City objects.
         */
        List<City> cities = new LinkedList<>();
        City[] citieslist = new City[] {
                new City("London", "UK"),
                new City("Paris", "France"),
                new City("Tokyo", "Japan"),
                new City("New York", "USA"),
                new City("Berlin", "Germany"),
                new City("Delhi", "India")
        };

        for (City city : citieslist) {
            cities.add(city);
        }

        // linkedlist methods

        System.out.println(cities.size());
        System.out.println(cities.get(3));
        System.out.println(cities.get(5));

        cities.set(3, new City("bengaluru", "India"));
        System.out.println(cities.get(3));

    }
}
