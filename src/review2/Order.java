package review2;

import java.util.ArrayList;

/**
 * Re/home/ianpresents an order of products.
 * @author ian
 */
public class Order {
    private String name;
    private static ArrayList<Product> products;
    /**
     * Initializes the fields.
     * in order to have the products changed after by the client after
     * the order has been created we meed to make a defensive copy
     * @param name
     * @param products
     */
    public Order(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = new ArrayList<>(products);
    }

    /**
     * Returns the name of the order
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the list of products associated with the order
     * @return
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    // test client
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("pie", 3.99));
        list.add(new Product("cake", 7.50));
        list.add(new Product("tart", 4.99));

        Order myOrder = new Order("myOrder", list);

        System.out.println(myOrder.getName() + " " + myOrder.getProducts());

        list.add(new Product("coffee", 1.99));

        System.out.println(myOrder.getName() + " " + myOrder.getProducts());

    }
}
