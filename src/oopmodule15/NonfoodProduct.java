/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule15;

import oopmodule14.*;
import java.util.Arrays;

/**
 *
 * @author Pinnacle F
 */
public class NonfoodProduct extends Product {

    /**
     * String array for the material list
     */
    private String[] materialList;

    /**
     * Constructer for nonFoodProduct
     * @param itemName The item name of the item as string 
     * @param itemPrice The item price of the item as double
     * @param materialList The items material list as a sting array
     */
    public NonfoodProduct(String itemName, double itemPrice, String[] materialList) {
        super(itemName, itemPrice);
        this.materialList = materialList.clone();
    }

    /**
     * Gets the material list of the item
     * @return a copy of the material list 
     */
    public String[] getMaterialList() {
        return materialList.clone();
    }

    /**
     * Overrides the material list
     * @param materialList as string array
     */
    public void setMaterialList(String[] materialList) {
        this.materialList = materialList;
    }

    /**
     * adds to the material list
     * @param material material to add as string
     * @return true upon success
     */
    public boolean addToMaterialList(String material) {
        this.materialList = Arrays.copyOf(this.materialList, this.materialList.length + 1);
        this.materialList[this.materialList.length - 1] = material;
        return false;
    }

    /**
     * Removes an item from the list
     * @param material item to be removed as string
     * @return true upon success
     */
    public boolean removeFromMaterialList(String material) {
        int foundIndex = -1;
        for (int i = 0; i < this.materialList.length; i++) {
            if (material.toLowerCase() == null ? false : material.equalsIgnoreCase(this.materialList[i])) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            for (int i = foundIndex; i < this.materialList.length; i++) {
                this.materialList[i] = this.materialList[i + 1];
            }
            this.materialList = Arrays.copyOf(this.materialList, this.materialList.length);
        }
        return false;
    }

    /**
     * Check to see if product contains a certain item
     * @param material item to be checked for as string 
     * @return true upon match found 
     */
    public boolean containsMaterial(String material) {
        for (String _material : this.materialList) {
            if (_material.toLowerCase() == null ? false : _material.equalsIgnoreCase(material)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Converts the contents of the fields to a multi line string and returns it
     * @return a multi line string 
     */
    @Override
    public String toString() {
        StringBuilder resultStringBuilder = new StringBuilder();
        //String result = 
        resultStringBuilder.append(this.getItemName()).append(String.format("%n"));
        for (int i = 0; i < this.materialList.length; i++) {
            resultStringBuilder.append(" * ").append(materialList[i]).append(String.format(i == this.materialList.length - 1 ? "" : "%n"));
        }
        return resultStringBuilder.toString();
    }
    
    /**
     * Test for equality in itemName, MaterialList and Type
     * @param object to be tested for equality
     * @return true upon equality
     */
    @Override
    public boolean equals(Object object) {
        if(!(object instanceof NonfoodProduct)){
            return false;
        }
        return ((NonfoodProduct)object).itemName.equals(this.itemName) && Arrays.equals(((NonfoodProduct)object).materialList, this.materialList);
    }

    /**
     * Generates hash code
     * @return hash code based on material list 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Arrays.deepHashCode(this.materialList);
        return hash;
    }
}
 