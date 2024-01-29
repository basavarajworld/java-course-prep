package SortingObjects.comparator;

/**
 * Represents a laptop object with its RAM, brand, and price.
 */
public class Laptop {

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
}
