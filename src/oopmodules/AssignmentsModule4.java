/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodules;

import java.util.Scanner;

/**
 *
 * @author Pinnacle F
 */
public class AssignmentsModule4 {

    public void assignemtStarter() {
        Scanner input = new Scanner(System.in);
        int userInputInt = -0;
        String userInputString = "";
        String[] assignments = new String[]{
            "Liang 7.3",
            "Liang 8.2",
            "Opgave c.1",
            "Opgave c.3",
            "Opgave c.4",
            "Opgave c.5",
            "Opgave c.6",
            "Opgave c.7"
        };
        while (true) {
            while (true) {
                for (int i = 0; i < assignments.length; i++) {
                    System.out.println((i+1)+". "+assignments[i]);
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
            }
            System.out.printf("---------------------|%-19s %12s|---------------------%n","Start of assignment", assignments[userInputInt-1]);
            switch (userInputInt) {
                case 1:
                    task_Liang7_3();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n","End of assignment", assignments[userInputInt-1]);
                    break;
                case 2:
                    task_Liang8_2();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n","End of assignment", assignments[userInputInt-1]);
                    break;
                case 3:
                    task_c_1();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n","End of assignment", assignments[userInputInt-1]);
                    break;
                case 4:
                    task_c_3();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n","End of assignment", assignments[userInputInt-1]);
                    break;
                case 5:
                    task_c_4();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n","End of assignment", assignments[userInputInt-1]);
                    break;
                case 6:
                    task_c_5();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n","End of assignment", assignments[userInputInt-1]);
                    break;
                case 7:
                    task_c_6();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n","End of assignment", assignments[userInputInt-1]);
                    break;
                case 8:
                    task_c_7();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n","End of assignment", assignments[userInputInt-1]);
                    break;
                default:
                    continue;
            }
        }
    }

    void task_Liang7_3() {
        /*  Write a program that reads the integers between 
            1 and 50 and counts the occurrences of each. Assume the input ends with 0.
         */
        
        //Initaiate object instances
        Scanner input = new Scanner(System.in);
        
        //Define variables
        int userInput;
        int[] count = new int[50];
        //Request user input
        System.out.println("Enter a list of numbers smaller than 50 and latger than 0 seperated by space and end the list with a 0");
        System.out.print("Enter list here: ");
        while (true) {
            userInput = input.nextInt();
            if (userInput != 0) {
                count[userInput-1] += 1;
            }else{
                break;
            }
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]>0){
                System.out.printf("[%d] Occurs %d times",(i+1),count[i]);
            }
        }
    }

    void task_Liang8_2() {

    }

    void task_c_1() {

    }

    void task_c_3() {

    }

    void task_c_4() {

    }

    void task_c_5() {

    }

    void task_c_6() {

    }

    void task_c_7() {

    }
}
