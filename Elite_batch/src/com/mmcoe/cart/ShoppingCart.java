package com.mmcoe.cart;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart implements Shopping {
    // Changed from Product[] to LinkedList
    private List<Product> items;
    private double total;

    public ShoppingCart() {
        this.items = new LinkedList<>();
        this.total = 0.0;
    }

    @Override
    public void addToCart(Product p) throws ShoppingCartException {
        if (p == null) {
            throw new ShoppingCartException("Cannot add a null product to the cart.");
        }
        items.add(p);
        total += p.getPrice();
        System.out.println(p.getName() + " added to your cart.");
    }

    @Override
    public void checkout() throws ShoppingCartException {
        // Checking if the LinkedList is empty
        if (items.isEmpty()) {
            throw new ShoppingCartException("Your cart is empty! Cannot checkout.");
        }

        System.out.println("\n--- Checking out your items ---");
        // Iterating through the LinkedList
        for (Product item : items) {
            System.out.println("- " + item);
        }
        System.out.println("-------------------------------");
        System.out.printf("Total Amount Paid: $%.2f\n", total);
    }
}