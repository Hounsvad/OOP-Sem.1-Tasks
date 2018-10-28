/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule14;

/**
 *
 * @author Pinnacle F
 */
public abstract class Product implements Expireable {

    /**
     *The last implemented item id
     */
    protected static int lastItemID = 0;

    /**
     *The current item id
     */
    protected int itemID;

    /**
     *The item name
     */
    protected final String itemName;

    /**
     *The item price
     */
    protected double itemPrice;

    /**
     * Contructs a product with name and price 
     * @param itemName product name as string
     * @param itemPrice product price as double
     */
    public Product(String itemName, double itemPrice) {
        this.itemID = ++lastItemID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    /**
     * Gets the item price
     * @return itemPrice as double
     */
    public double getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets the item price
     * @param itemPrice new price as double
     */
    public void setItemPrice(double itemPrice) {
        if (itemPrice > 0) {
            this.itemPrice = itemPrice;
        }
    }

    /**
     * Gets the item id
     * @return item id as integer
     */
    public int getItemID() {
        return itemID;
    }

    /**
     * Returns item name 
     * @return itemName as string
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * NOT IMPLEMENTED
     * THROWS "UnsupportedOperationException"
     * Check to see if item is expired
     * @return 
     */
    @Override
    public boolean isExpired() {
        throw new UnsupportedOperationException("Product does not support this operation");
    }
    
    
}
