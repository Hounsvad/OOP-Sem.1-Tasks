/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.Map;

/**
 *
 * @author Pinnacle F
 */
public class ProductDatabase {

    /**
     * Product database HashMap list
     */
    private final Map<UUID, Product> list = new HashMap<>();

    /**
     * No argument constructer, as i were forced to
     */
    public ProductDatabase() {
    }

    /**
     * Makes a new arraylist and appends all items in the arraylist
     *
     * @return a deep copy of list
     */
    public Map<UUID, Product> getList() {
        Map<UUID, Product> result = new HashMap<>();
        for (Map.Entry<UUID, Product> entry : this.list.entrySet()) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    /**
     * Adds a product to the database.
     *
     * @param product the product to be added
     * @return true upon successfully adding the product
     */
    public boolean addProduct(Product product) {
        return (list.put(UUID.randomUUID(), product) != null);
    }

    /**
     * Removes a product from the database
     *
     * @param itemID by which to remove the product
     * @return true upon successfully remove the product
     */
    public boolean removeProduct(int itemID) {
        for (Map.Entry<UUID, Product> entry : this.list.entrySet()) {
            if (entry.getValue().itemID == itemID) {
                return this.list.remove(entry.getKey()) != null;
            }
        }
        return false;
    }

    /**
     * Removes a product from the database
     *
     * @param itemName by which to remove the product
     * @return true upon successfully remove the product
     */
    public boolean removeProduct(String itemName) {
        for (Map.Entry<UUID, Product> entry : this.list.entrySet()) {
            if (entry.getValue().itemName.equals(itemName)) {
                return this.list.remove(entry.getKey()) != null;
            }
        }
        return false;
    }

    //This is very involentery
    /**
     * Removes a product from the database
     *
     * @param p by which to remove the product
     * @return true upon successfully remove the product
     */
    public boolean removeProduct(Product p) {
        for (Map.Entry<UUID, Product> entry : this.list.entrySet()) {
            if (entry.getValue().equals(p)) {
                return this.list.remove(entry.getKey()) != null;
            }
        }
        return false;
    }

    /**
     * The sum of the item price of all items
     *
     * @return the sum as a double
     */
    public double productDatabaseSum() {
        double sum = 0;
        for (Map.Entry<UUID, Product> entry : this.list.entrySet()) {
            if (entry.getValue() != null) {
                sum += entry.getValue().getItemPrice();
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
        for (Map.Entry<UUID, Product> entry : this.list.entrySet()) {
            if (entry.getValue() != null && entry.getValue().getItemID() == itemID) {
                return entry.getValue();
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
        for (Map.Entry<UUID, Product> entry : this.list.entrySet()) {
            if (entry.getValue() != null) {
                if (entry.getValue().getItemName().equalsIgnoreCase(itemName) == true) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    /**
     * Deletes all food products that are expired
     */
    public void removeExpiredFoods() {
        ArrayList<UUID> foundKeys = new ArrayList<>();
        for (Map.Entry<UUID, Product> entry : this.list.entrySet()) {
            try {
                if (entry.getValue().isExpired()) {
                    //removeProduct(product.itemID);
                    foundKeys.add(entry.getKey());
                }
            } catch (UnsupportedOperationException e) {

            }
        }
        for (UUID key : foundKeys) {
            this.list.remove(key);
        }
    }

    public List<Product> sortedByNameLength() {
        List<Product> data = new ArrayList(list.values());
        Comparator<Product> comp = new ProductNameLengthComparator();
        Collections.sort(data, comp);
        return data;
    }

    public List<Product> sortedByPrice() {
        List<Product> data = new ArrayList(list.values());
        Collections.sort(data);
        return data;
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
        for (Map.Entry<UUID, Product> entry : this.list.entrySet()) {
            if (entry.getValue() != null) {
                resultStringBuilder.append(String.format(
                        "%-25s%-25s%-25s%n",
                        entry.getValue().getItemName(),
                        entry.getValue().getItemID(),
                        entry.getValue().getItemPrice()));
            }
        }
        return resultStringBuilder.toString();
    }
}
