package net.hiperdino;

import java.util.Iterator;
import java.util.Stack;

import net.hiperdino.generators.ClientGenerator;
import net.hiperdino.generators.ProductGenerator;

public class Client {
    private String name;
    private Stack<String> cart;

    public Client() {
        this.name = ClientGenerator.obtainRandomName();
        this.cart = new Stack<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The addToCart function adds a randomly generated product to the cart and
     * prints a confirmation
     * message.
     */
    public void addToCart() {
        String product = ProductGenerator.obtainRandomProduct();
        cart.push(product);
        System.out.println(product + " has been added to the cart.");
    }

    /**
     * The function `getProductList` generates a list of product names from a cart
     * and returns it as a
     * string.
     * 
     * @return The `getProductList` method returns a string containing a list of
     *         product names stored
     *         in the `cart` collection. Each product name is enclosed in angle
     *         brackets ("< >") and separated
     *         by a new line character ("\n").
     */
    private String getProductList() {
        String productNames = "";
        Iterator<String> value = this.cart.iterator();
        while (value.hasNext()) {
            String generatedName = "<" + (String) (value.next()).toString() + ">";
            productNames += generatedName + "\n";
        }
        return productNames;
    }

    /**
     * Overrides the function toString to obtain information about the required
     * object
     * matching the professor enquires.
     */
    @Override
    public String toString() {
        return "* Nombre: " + "< " + getName() + " > \n" + "* Total de productos: " + "< "
                + this.cart.size() + " > \n" + "* Lista de artículos en la cesta: \n" + getProductList();
    }
}
