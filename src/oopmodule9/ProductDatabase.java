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

    Product[] list;
    private int initialListLength = -1;

    public ProductDatabase() {
        //If nothing is specified then make the size 1
        this(1);
    }

    public ProductDatabase(int initialListLength) {
        this.list = new Product[initialListLength];
        this.initialListLength = initialListLength;
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
            if (this.list[i].getItemID() == itemID) {
                foundIndex = i;

            }
        }
        if (foundIndex != -1) {

            for (int i = foundIndex; i < this.list.length - 1; i++) {
                this.list[i] = this.list[i + 1];
            }
            if (this.initialListLength < list.length) {
                this.list = Arrays.copyOf(this.list, this.list.length - 1);
            }
            return true;
        }
        return false;
    }

    public double productDatabase() {
        double sum = 0;
        for (Product product : this.list) {
            sum += product.getItemPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        String result = String.format("%-25s%-25s%-25s%n", "Items", "Item id", "Item price");
        for (int i = 0; i < 10; i++) {
        result = result + String.format("%-25s%-25s%-25s",list[i].getItemName(),list[i].getItemID(),list[i].getItemPrice());//result + " - " + list[i].getItemName() + (i == this.materialList.length - 1 ? "" : "%n");
        }
        return "";
    }
}
