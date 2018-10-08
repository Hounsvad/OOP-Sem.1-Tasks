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

    protected static int lastItemID = 0;
    protected int itemID;
    protected final String itemName;
    protected double itemPrice;
    protected int itemCount;

    @SuppressWarnings("ValueOfIncrementOrDecrementUsed")
    public Product(String itemName, double itemPrice, int itemCount) {
        this.itemID = ++lastItemID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCount = itemCount;
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

    public int getItemCount() {
        return itemCount;
    }

    /**
     * "adds" the input to the itemCount
     * if you whish to subtract simply add the value * -1
     * @param value the value to be "added" 
     * @return the new itemCount
     */
    public int changeItemCount(int value){
        
        return getItemCount();
    }
}
