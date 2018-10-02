/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule9;

import oopmodule8.*;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Hounsvad
 */
public class AssignmentsModule9 {

    /**
     * An assignment handler that runs the user requested task
     */
    public void assignmentStarter() {
        Scanner input = new Scanner(System.in);
        int userInputInt = -0;
        String userInputString = "";
        String[] assignments = new String[]{
            "Opgave 1",
            "Opgave 2",
            "Opgave 3"
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
                    task1();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 2:
                    task2();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 3:
                    task3();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                default:
            }
        }
    }

    void task1() {
        
    }

    void task2() {

    }

    void task3() {

    }

}
