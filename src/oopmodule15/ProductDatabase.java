/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule15;

import oopmodule14.*;
import java.util.ArrayList;

/**
 *
 * @author Pinnacle F
 */
public class ProductDatabase {

    /**
     * Product database list
     */
    private ArrayList<Product> list = new ArrayList<>(); 

    /**
     * No argument constructer, as i were forced to
     */
    public ProductDatabase() {
    }

    /**
     * Makes a new arraylist and appends all items in the arraylist
     * @return a deep copy of list
     */
    public ArrayList<Product> getList() {
        ArrayList<Product> result = new ArrayList<>();
        for(Product product : this.list){
            result.add(product);
        }
        return result;
    }

    /**
     * Adds a product to the database.
     * @param product the product to be added
     * @return true upon successfully adding the product
     */
    public boolean addProduct(Product product) {
        return list.add(product);
    }

    /**
     * Removes a product from the database
     * @param itemID by which to remove the product
     * @return true upon successfully remove the product
     */
    public boolean removeProduct(int itemID) {
        for(Product product : list)
        {
            if(product.itemID == itemID){
                return list.remove(product);
            }
        }
        return false;
    }

    /**
     * Removes a product from the database
     * @param itemName by which to remove the product
     * @return true upon successfully remove the product
     */
    public boolean removeProduct(String itemName) {
        for(Product product : list)
        {
            if(product.itemName.equals(itemName)){
                return list.remove(product);
            }
        }
        return false;
    }
    
    //This is very involentery

    /**
     * Removes a product from the database
     * @param p by which to remove the product
     * @return true upon successfully remove the product
     */
    public boolean removeProduct(Product p){
        return list.remove(p);
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
            if (product != null && product.getItemID() == itemID) {
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
     *  Deletes all food products that are expired
     */
    public void removeExpiredFoods(){
        ArrayList<Product> foundItems = new ArrayList<>();
        for(Product product : this.list){
            try {
                if(product.isExpired()){
                    //removeProduct(product.itemID);
                    foundItems.add(product);
                }
            } catch (Exception e) {}
        }
        for(Product product : foundItems){
            this.list.remove(product);
        }
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
