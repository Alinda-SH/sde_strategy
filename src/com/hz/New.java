package com.hz;

public class New implements Customer{
    @Override
    public ShoppingCart getCart() {
        return cart;
    }

    @Override
    public String getName() {
        return name;
    }
}
