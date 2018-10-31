/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule16;

import java.util.Comparator;

/**
 *
 * @author Pinnacle F
 */
public class ProductNameLengthComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1 == null || o2 == null) {
            if(o1 == null && o2 != null){
                return -1;
            }else if(o1 != null && o2 == null){
                return 1;
            }else{
                return 0;
            }
        } else {
            if (o1.getItemName().length() > o2.getItemName().length()) {
                return 1;
            } else if (o1.getItemName().length() < o2.getItemName().length()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

}
