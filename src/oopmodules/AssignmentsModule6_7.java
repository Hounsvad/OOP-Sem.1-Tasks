/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodules;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hounsvad
 */
public class AssignmentsModule6_7 {

    /**
     * An assignment handler that runs the user requested task
     */
    public void assignmentStarter() {
        Scanner input = new Scanner(System.in);
        int userInputInt = -0;
        String userInputString = "";
        String[] assignments = new String[]{
            "Assignment 1",
            "Assignment 2"
        };
        while (true) {
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
                    assignment1();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 2:
                    assignment2();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                default:
            }
        }
    }

    void assignment1() {
        Customer aCustomer = new Customer("Bob briary", 2060518, 13.51);
        aCustomer.deposit(100);
        aCustomer.withdraw(99.99);
        System.out.printf("The customer balance of " + aCustomer.name + " is %.4f SDU Bobs%n", aCustomer.getBalance());
    }

    void assignment2() {
        CustomerDatabase database = new CustomerDatabase();
        Customer c1 = new Customer("Bob briary", 1, 0);
        Customer c2 = new Customer("Beatrice briary", 2, 500);

        database.addCustomer(c1);
        database.addCustomer(c2);

        database.printCustomerNames();

        //Bobs wife does not want him here she handles the money
        database.removeCustomer(1);

        database.printCustomerNames();

        for (Customer customer : database.getCustomers()) {
            if (customer != null) {
                System.out.println("Adding loyalty bonus to " + customer.name);
                customer.deposit(10);
            }
        }
    }
}

