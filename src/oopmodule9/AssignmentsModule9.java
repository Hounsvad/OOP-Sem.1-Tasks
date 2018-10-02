/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule9;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Hounsvad
 */
public class AssignmentsModule9 {

    /**
     * An assignment handler that runs the user requested task
     */
    public void assignmentStarter() {
        task();
    }

    void task() {
        System.out.printf("---------------------|%-19s %12s|---------------------%n", "Start of assignment", "Todays assignment");
        //Creating database
        ProductDatabase database = new ProductDatabase(20);
        //Creating items

        //Nonfood items
        NonfoodProduct brush = new NonfoodProduct("WetBrush", 180, new String[]{"PP"});
        NonfoodProduct toilet = new NonfoodProduct("Shitomatron 5000", 20000, new String[]{"PP", "PET", "PVC", "Copper", "Glassfiber"});

        //food items
        FoodProduct squash = new FoodProduct("Squash", 15, new Date(1538517600000L), 5);
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

        //Removing toilet from database
        database.removeProduct(2);
        System.out.println("After removing toilet");
        System.out.println(database.toString());

        //Adding new product
        database.addProduct(new FoodProduct("Cup noodles", 1.25d, new Date(1664920800000L), 25));
        System.out.println("After adding cup noodles");
        System.out.println(database.toString());

        //showing brush contents
        System.out.println("Testing toString methods");
        System.out.println(database.getProduct("wetbrush").toString());

        //showing cup noodles contents
        System.out.println(database.getProduct("cup noodles").toString());
        
        //System.out.println(database.getProduct("squash").isExpired(new Date(System.currentTimeMillis())));
        
        System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", "Todays assignment");
    }
}
