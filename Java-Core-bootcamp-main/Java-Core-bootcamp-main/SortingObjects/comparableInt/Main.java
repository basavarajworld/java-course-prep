package SortingObjects.comparableInt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop(16, "HP", 500));
        laptops.add(new Laptop(8, "apple", 1000));
        laptops.add(new Laptop(4, "lenovo", 300));

        /**
         * Sorts the list of laptops in ascending order based on their natural ordering.
         * Prints each laptop in the sorted list.
         *
         * @param laptops The list of laptops to be sorted and printed.
         */
        Collections.sort(laptops);

        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }
}
