package SortingObjects.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Creates a list of laptops and adds three laptops to it.
         *
         * @return The list of laptops.
         */
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop(16, "HP", 500));
        laptops.add(new Laptop(8, "apple", 1000));
        laptops.add(new Laptop(4, "lenovo", 300));

        /**
         * Sorts the list of laptops using the PriceComparator.
         *
         * @param laptops The list of laptops to be sorted.
         */
        Collections.sort(laptops, new PriceComparator());

        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }
}
