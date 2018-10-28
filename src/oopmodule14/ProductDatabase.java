/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule14;

import java.util.ArrayList;

/**
 *
 * @author Pinnacle F
 */
public class ProductDatabase {

    private ArrayList<Product> list = new ArrayList<>(); 

    public ProductDatabase() {
    }

    public ArrayList<Product> getList() {
        return list;
    }

    public boolean addProduct(Product product) {
        return list.add(product);
    }

    public boolean removeProduct(int itemID) {
        for(Product product : list)
        {
            if(product.itemID == itemID){
                return list.remove(product);
            }
        }
        return false;
    }

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
    public void removeProduct(Product p){
        list.remove(p);
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
        for(Product product : this.list){
            try {
                if(product.isExpired()){
                    removeProduct(product.itemID);
                }
            } catch (Exception e) {}
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
