/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule9;

/**
 *
 * @author Pinnacle F
 */
public class Product {

    public static int lastItemID = 0;
    private int itemID;
    private final String itemName;
    private double itemPrice;

    public Product(String itemName, double itemPrice) {
        this.itemID = ++lastItemID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        if (itemPrice > 0) {
            this.itemPrice = itemPrice;
        }
    }

    public int getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }
}
