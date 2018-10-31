/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule15;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Hounsvad
 */
public class AssignmentsModule15 {

    /**
     * An assignment handler that runs the user requested task
     */
    public void assignmentStarter() {
        Scanner input = new Scanner(System.in);
        int userInputInt = -1;
        String userInputString = "";
        String[] assignments = new String[]{
            "Main task",
            "Liang 12.2",
            "Liang 12.3",
            "Liang 12.5"
        };
        while (true) {
            userInputInt = -1;
            while (true) {
                for (int i = 0; i < assignments.length; i++) {
                    System.out.println((i + 1) + ". " + assignments[i]);
                }
                System.out.println("Enter a value equal to the desired task");
                if (input.hasNext()) {
                    if (input.hasNextInt()) {
                        userInputInt = input.nextInt();
                        break;
                    } else {
                        userInputString = input.next();
                        break;
                    }
                } else {
                    input.next();
                }
            }
            if (userInputInt == -1) {
                //Too lazy to turn this into a if else statement
                switch (userInputString.toLowerCase()) {
                    case "exit":
                    case "terminate":
                    case "end":
                        System.exit(0);
                        break;
                    default:
                        continue;
                }
            } else if (userInputInt > assignments.length) {
                continue;
            }
            System.out.printf("---------------------|%-19s %12s|---------------------%n", "Start of assignment", assignments[userInputInt - 1]);
            switch (userInputInt) {
                case 1:
                    try {
                        task();
                    } catch (ExpiredProductAddedException ex) {
                        System.out.println("The user attempted to add a product that was too old");
                    }
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 2:
                    liang12_2();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 3:
                    liang12_3();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 4:
                    liang12_5();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                default:
            }
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
        database.addProduct(toilet);
        database.addProduct(new FoodProduct("Cup noodles", 1.25d, new Date(1664920800000L), 25));
        System.out.println("After adding cup noodles");
        System.out.println(database.toString());

        //showing brush contents
        System.out.println("Testing toString methods");
        System.out.println(database.getProduct("Shitomatron 5000").toString());

        //showing cup noodles contents
        System.out.println(database.getProduct("cup noodles").toString());

        if (database.getProduct("squash") instanceof FoodProduct) {
            FoodProduct product = (FoodProduct) database.getProduct("squash");
            System.out.println("The squash is " + (product.isExpired() ? "expired" : "still good"));
        }

        System.out.println("Printing all items \n\n");
        for (Product product : database.getList()) {
            System.out.println(product.toString());
        }

        System.out.println("Test of removeExpiredFoods");
        System.out.println("Printing all items \n\n");
        for (Product product : database.getList()) {
            System.out.println(product.toString());
        }
        database.removeExpiredFoods();
        System.out.println("Printing all items \n\n");
        for (Product product : database.getList()) {
            System.out.println(product.toString());
        }

        System.out.println("Storage value total: " + database.productDatabaseSum());
        System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", "Todays assignment");
    }

    void liang12_2() {
        Scanner s = new Scanner(System.in);
        int userInput;
        String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October",
            "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Enter a number between 1 and 12: ");
        try {
            userInput = (s.hasNextInt() ? s.nextInt() : 0);
            System.out.printf("%-10s%3d%n", months[userInput - 1], dom[userInput - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong number");
            s.next();
        }
    }

    void liang12_3() {
        Scanner s = new Scanner(System.in);
        int userInput;
        String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October",
            "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Enter a number between 1 and 12: ");
        try {
            userInput = (s.hasNextInt() ? s.nextInt() : 0);
            System.out.printf("%-10s%3d%n", months[userInput - 1], dom[userInput - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong number");
            s.next();
        }
    }

    void liang12_5() {

        try {
            System.out.println(new Triangle(1, 2, 3));
            System.out.println(new Triangle(1, 2, 4));
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

    }
}
