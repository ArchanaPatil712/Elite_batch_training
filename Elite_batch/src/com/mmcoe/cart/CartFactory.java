package com.mmcoe.cart;

public class CartFactory {

    // Factory method returning the interface type 'Shopping'
    public static Shopping getCart() {
        // Hides the concrete instantiation of ShoppingCart from the client
        return new ShoppingCart();
    }
}