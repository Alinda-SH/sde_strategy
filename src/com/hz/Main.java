package com.hz;

import products.CuteTeddyBear;

public class Main {


    // Main scenario
    public static void main(String[] args) {


        // There is a shop with a checkout
        Checkout kassa5 = new Checkout(SalesAction.ChristmasEve);

        // Two customers enter the shop
        CustomerClass piet = new CustomerClass(CustomerType.Regular, "Piet");
        CustomerClass anne = new CustomerClass(CustomerType.New, "Anne");

        // buying stuff
        piet.buys(new CuteTeddyBear());
        anne.buys(new CuteTeddyBear());

        // and proceed to checkout
        kassa5.nextInLine(piet);
        kassa5.nextInLine(anne);


    }


}
