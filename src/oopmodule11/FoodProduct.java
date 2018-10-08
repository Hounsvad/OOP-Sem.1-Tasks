/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule11;

import oopmodule11.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Pinnacle F
 */
public class FoodProduct extends Product {

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

    public boolean isExpired(Date comparedDate) {
        return comparedDate.getTime() > this.expirationDate.getTime();
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
        return ((FoodProduct)object).itemName == (this.itemName) && ((FoodProduct)object).expirationDate == this.expirationDate;
    }
}
