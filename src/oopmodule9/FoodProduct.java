/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule9;

import java.util.Date;

/**
 *
 * @author Pinnacle F
 */
public class FoodProduct extends Product{
    private final Date expirationDate;
    private final int StorageTemperature;
    
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
    
    public boolean isExpired(Date comparedDate){
        if(comparedDate.getTime() > this.expirationDate.getTime()){
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        String result = String.format(" - %s%n%-15s: %s", this.getItemName(), "Expiration date", this.expirationDate.toString());
        return result;
    }
}
