package com.hz;

public class Regular implements Customer{
    @Override
    public ShoppingCart getCart() {
        return cart;
    }

    @Override
    public String getName() {
        return name;
    }


}
