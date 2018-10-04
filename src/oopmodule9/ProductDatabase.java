/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule9;

import java.util.Arrays;

/**
 *
 * @author Pinnacle F
 */
public class ProductDatabase {

    private Product[] list;
    private int initialListLength = -1;

    public ProductDatabase() {
        //If nothing is specified then make the size 1
        this(1);
    }

    public ProductDatabase(int initialListLength) {
        this.list = new Product[initialListLength];
        this.initialListLength = initialListLength;
    }

    public Product[] getList() {
        return list.clone();
    }

    public boolean addProduct(Product product) {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == null) {
                this.list[i] = product;
                return true;
            }
        }
        this.list = Arrays.copyOf(this.list, this.list.length + 1);
        this.list[this.list.length] = product;
        return false;
    }

    public boolean removeProduct(int itemID) {
        int foundIndex = -1;
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] != null) {
                if (this.list[i].getItemID() == itemID) {
                    foundIndex = i;
                    break;
                }
            }
        }
        if (foundIndex != -1) {
            removeAndSort(foundIndex);
            decrementlist();
            return true;
        }
        return false;
    }

    public boolean removeProduct(String itemName) {
        int foundIndex = -1;
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] != null) {
                if (this.list[i].getItemName().equalsIgnoreCase(itemName)) {
                    foundIndex = i;
                    break;
                }
            }
        }
        if (foundIndex != -1) {

            removeAndSort(foundIndex);
            decrementlist();
            return true;
        }
        return false;
    }
    
    /**
     * Removes product from the database by moving all others down so as to leave no empty spaces elsewhere than the end 
     * @param foundIndex 
     */
    private void removeAndSort(int foundIndex) {
        for (int i = foundIndex; i < this.list.length - 1; i++) {
            this.list[i] = this.list[i + 1];
        }
    }

    /**
     * Shortens the database array by one as long as it is not below the preset limit
     */
    private void decrementlist() {
        if (this.initialListLength < list.length) {
            this.list = Arrays.copyOf(this.list, this.list.length - 1);
        }
    }

    /**
     * The sum of the item price of all items
     * @return the sum as a double
     */
    public double productDatabaseSum() {
        double sum = 0;
        for (Product product : this.list) {
            if (product != null) {
                sum += product.getItemPrice();
            }
        }
        return sum;
    }

    /**
     * Returns a product
     *
     * @param itemID the item id by which to return a product
     * @return
     */
    public Product getProduct(int itemID) {
        for (Product product : this.list) {
            if (product != null || product.getItemID() == itemID) {
                return product;
            }
        }
        return null;
    }
    /**
     * Returns a product
     *
     * @param itemName the item name by which to return a product 
     * @return
     */
    public Product getProduct(String itemName) {
        for (Product product : this.list) {
            if (product != null) {
                if (product.getItemName().equalsIgnoreCase(itemName) == true) {
                    return product;
                }
            }
        }
        return null;
    }

    /**
     * Returns a string containing a list of all items in the database
     *
     * @return a string containing all items in list form
     */
    @Override
    public String toString() {
        StringBuilder resultStringBuilder = new StringBuilder();
        resultStringBuilder.append(String.format("%-25s%-25s%-25s%n", "Items", "Item id", "Item price"));
        for (Product product : this.list) {
            if (product != null) {
                resultStringBuilder.append(String.format(
                        "%-25s%-25s%-25s%n",
                        product.getItemName(),
                        product.getItemID(),
                        product.getItemPrice()));
            }
        }
        return resultStringBuilder.toString();
    }
}
