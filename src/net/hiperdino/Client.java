package net.hiperdino;

import java.util.Stack;

import net.hiperdino.generators.ClientGenerator;
import net.hiperdino.generators.ProductGenerator;

public class Client {
    private String name;
    private Stack<String> cart;

    public Client (){
        this.name = ClientGenerator.obtainRandomName();
        this.cart = new Stack<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addToCart() {
        String product = ProductGenerator.obtainRandomProduct();
        cart.push(product);
        System.out.println(product + " has been added to the cart.");
    }
}
