/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule16;

import oopmodule15.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Pinnacle F
 */
public class FoodProduct extends Product {
    
    /**
     * Expiration date
     */
    private final Date expirationDate;
    /**
     * Storage temperature
     */
    private final int StorageTemperature;

    /**
     * Contructer for foodproduct
     * 
     * @param itemName The item name of the product
     * @param itemPrice The item price of the product
     * @param expirationDate The expiration date of the item
     * @param storageTemperature The storage temperature of the item
     * @throws oopmodule15.ExpiredProductAddedException if the added product is expired
     */
    public FoodProduct(String itemName, double itemPrice, Date expirationDate, int storageTemperature) throws ExpiredProductAddedException {
        super(itemName, itemPrice);
        if(expirationDate.before(new Date())){
            throw new ExpiredProductAddedException();
        }
        this.expirationDate = expirationDate;
        this.StorageTemperature = storageTemperature;
    }

    /**
     * Gets expiration date
     * @return expiration date as Date
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Gets storage temperature
     * @return storage temperature as integer
     */
    public int getStorageTemperature() {
        return StorageTemperature;
    }
    
    /**
     * Check to see if the item is expired
     * @return true if the item is expired
     */
    @Override
    public boolean isExpired() {
        Date currentDate = new Date();
        return currentDate.getTime() > this.expirationDate.getTime();
    }

    /**
     * Converts the fields of the food product to a string
     * 
     * @return the contents of the fields in a formatted fashion as  a single multi line string
     */
    @Override
    public String toString() {
        SimpleDateFormat dateFormater = new SimpleDateFormat("EEE, dd MMM yyyy");
        String result = String.format("%s%n%-15s: %s",
                this.getItemName(),
                " - Expiration date",
                dateFormater.format(expirationDate));
        return result;
    }
    
    /**
     * Test for equality in itemName, expirationDate and Type
     * @param object The object to be tested
     * @return true upon equality
     */
    @Override
    public boolean equals(Object object) {
        if(!(object instanceof FoodProduct)){
            return false;
        }
        return ((FoodProduct)object).itemName.equals(this.itemName) && ((FoodProduct)object).expirationDate == this.expirationDate;
    }
    
    /**
     * Generates hash code 
     * @return a hashcode as an integer
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.expirationDate);
        hash = 53 * hash + this.StorageTemperature;
        return hash;
    }
}
