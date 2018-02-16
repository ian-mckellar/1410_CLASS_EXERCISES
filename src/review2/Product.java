package review2;

/**
 *
 * Represents a product with a specified name and a specified price
 *
 */
public class Product {
    private String name;
    private Double price;

    /**
     * Initilizes a product with a name and a price
     * @param name
     * @param price
     */
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Returns the name of the product.
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the price of a product.
     * @return
     */
    public Double getPrice() {
        return price;
    }

    /**
     * returns a string of a product in format
     * {name}(${price})
     * @return
     */
    @Override
    public String toString() {
        return String.format("%s($%.2f)", name, price);
    }

    public static void main(String[] args) {
        Product p = new Product("pie", 3.99);
        System.out.println(p);
    }

}
