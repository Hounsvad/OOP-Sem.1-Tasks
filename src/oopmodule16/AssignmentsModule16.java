/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule16;

import java.util.Date;


/**
 *
 * @author Hounsvad
 */
public class AssignmentsModule16 {

    /**
     * An assignment handler that runs the user requested task
     */
    public void assignmentStarter() {
        try{
            task();
        }catch(ExpiredProductAddedException e){
            System.out.println("An expired product were added");
        }
                
    }

    /**
     * The assignment itself
     */
    void task() throws ExpiredProductAddedException {
        System.out.printf("---------------------|%-19s %12s|---------------------%n", "Start of assignment", "Todays assignment");
        //Creating database
        ProductDatabase database = new ProductDatabase();
        //Creating items

        //Nonfood items
        NonfoodProduct brush = new NonfoodProduct("WetBrush", 180, new String[]{"PP"});
        NonfoodProduct toilet = new NonfoodProduct("Shitomatron 5000", 20000, new String[]{"PP", "PET", "PVC", "Copper", "Glassfiber"});

        //food items
        FoodProduct squash = new FoodProduct("Squash", 15, new Date(1570226400000L), 5);
        FoodProduct cannedPeaches = new FoodProduct("Canned peaches", 8, new Date(1570226400000L), 20);
        //Adding items to db
        
        database.addProduct(brush);
        database.addProduct(toilet);
        System.out.println("After adding Nonfood items");
        System.out.println(database.toString());

        database.addProduct(squash);
        database.addProduct(cannedPeaches);
        System.out.println("After adding food items");
        System.out.println(database.toString());

        if (database.getProduct("squash") instanceof FoodProduct) {
            FoodProduct product = (FoodProduct) database.getProduct("squash");
            System.out.println("The squash is " + (product.isExpired() ? "expired" : "still good"));
        }
        System.out.println("\n\nSorted by name length");
        for(Product product : database.sortedByNameLength()){
            System.out.println(product);
        }
        System.out.println("\n\nSorted by price");
        for(Product product : database.sortedByPrice()){
            System.out.println(product);
        }        
        
        FoodProduct squash2 = new FoodProduct("Squash", 15, new Date(1538517600000L), 5);
        System.out.println("Storage value total: " + database.productDatabaseSum());
        System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", "Todays assignment");
    }
}
