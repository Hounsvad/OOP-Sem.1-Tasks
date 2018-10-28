/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule14;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Pinnacle F
 */
public class FoodProduct extends Product {

    private final Date expirationDate;
    private final int StorageTemperature;

    /**
     * 
     * 
     * @param itemName
     * @param itemPrice
     * @param expirationDate
     * @param storageTemperature
     */
    public FoodProduct(String itemName, double itemPrice, Date expirationDate, int storageTemperature) {
        super(itemName, itemPrice);
        this.expirationDate = expirationDate;
        this.StorageTemperature = storageTemperature;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public int getStorageTemperature() {
        return StorageTemperature;
    }
    
    @Override
    public boolean isExpired() {
        Date currentDate = new Date();
        return currentDate.getTime() > this.expirationDate.getTime();
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormater = new SimpleDateFormat("EEE, dd MMM yyyy");
        String result = String.format("%s%n%-15s: %s",
                this.getItemName(),
                " - Expiration date",
                dateFormater.format(expirationDate));
        return result;
    }
    
    @Override
    public boolean equals(Object object) {
        if(!(object instanceof FoodProduct)){
            return false;
        }
        return ((FoodProduct)object).itemName.equals(this.itemName) && ((FoodProduct)object).expirationDate == this.expirationDate;
    }
}
