package com.mmcoe.cart;

public class TestCart {
    public static void main(String[] args) {
        try {
            // Get our dynamic LinkedList-backed cart from the factory
            Shopping cart = CartFactory.getCart();

            cart.addToCart(new Product("Java Design Patterns", 45.99));
            cart.addToCart(new Product("Logitech Mouse", 25.50));
            cart.addToCart(new Product("Mechanical Keyboard", 89.00));

            cart.checkout();

        } catch (ShoppingCartException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}