package SortingObjects.comparator;

import java.util.Comparator;

/**
 * A custom comparator for comparing Laptop objects based on their price.
 * This class implements the Comparator interface.
 */
public class PriceComparator implements Comparator<Laptop> {
    /**
     * Compares two laptops based on their prices.
     *
     * @param l1 The first laptop to compare
     * @param l2 The second laptop to compare
     * @return 1 if the price of l1 is greater than the price of l2, -1 if the price
     *         of l1 is less than the price of l2,
     *         and 0 if the prices are equal.
     */
    @Override
    public int compare(Laptop l1, Laptop l2) {
        if (l1.getPrice() > l2.getPrice())
            return 1;
        else
            return -1;
    }

}
