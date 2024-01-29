package SortingObjects.comparableInt;

/**
 * Represents a laptop object.
 * Implements the Comparable interface to enable comparison between laptop
 * objects.
 */
public class Laptop implements Comparable<Laptop> {

    private int ram;
    private String brand;
    private int price;

    public Laptop(int ram, String brand, int price) {
        this.ram = ram;
        this.brand = brand;
        this.price = price;
    }

    public int getRam() {
        return this.ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return A string representation of the object in the format:
     *         { ram='[RAM]', brand='[BRAND]', price='[PRICE]' }
     */
    @Override
    public String toString() {
        return "{" +
                " ram='" + getRam() + "'" +
                ", brand='" + getBrand() + "'" +
                ", price='" + getPrice() + "'" +
                "}";
    }

    /**
     * Compares this Laptop object with another Laptop object based on their RAM
     * sizes.
     * Returns a positive integer if this Laptop has more RAM than the other Laptop,
     * and a negative integer if this Laptop has less RAM than the other Laptop.
     * If the RAM sizes are equal, returns 0.
     *
     * @param o The Laptop object to compare with.
     * @return A positive integer if this Laptop has more RAM, a negative integer if
     *         this Laptop has less RAM,
     *         and 0 if the RAM sizes are equal.
     */
    @Override
    public int compareTo(Laptop o) {
        if (this.ram > o.ram)
            return 1;
        else
            return -1;
    }

}
