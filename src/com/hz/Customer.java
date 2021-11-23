package com.hz;

import products.Product;

public interface Customer {

    CustomerType customerType = null;
    String name = null;
    ShoppingCart cart = null;

    public String getName();
    public ShoppingCart getCart();

//    public CustomerClass(CustomerType customerType, String name) {
//        this.customerType = customerType;
//        this.name = name;
//
//        this.cart = new ShoppingCart();
//    }
//
//    public void buys(Product product) {
//        this.cart.add(product);
//    }
//
//    public boolean isRegular() {
//
//        return this.customerType == CustomerType.Regular;
//    }
}
