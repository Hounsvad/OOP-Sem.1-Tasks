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
            }
            System.out.printf("---------------------|%-19s %12s|---------------------%n", "Start of assignment", assignments[userInputInt - 1]);
            switch (userInputInt) {
                case 1:
                    task_Liang7_3();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 2:
                    task_Liang8_2();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 3:
                    task_c_1();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 4:
                    task_c_3();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 5:
                    task_c_4();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 6:
                    task_c_5();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 7:
                    task_c_6();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 8:
                    task_c_7();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
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
            if (input.hasNextInt()) {
                userInput = input.nextInt();
                if (userInput != 0) {
                    count[userInput - 1] += 1;
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.printf("[%d] Occurs %d times%n", (i + 1), count[i]);
            }
        }
    }

    void task_Liang8_2() {
        Scanner input = new Scanner(System.in);
        double average = 0;
        double[][] matrix = new double[4][4];
        String[] xLine = new String[]{"first", "second", "third", "fourth"};
        System.out.println("Enter four lines of four numbers");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Enter the %s line :", xLine[i]);
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            average += matrix[i][i];
        }
        average = average / 4;
        System.out.println("Average of the elements in the major diagonal is " + average);
    }

    void task_c_1() {
        int[] radii = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < radii.length; i++) {
            double area = Math.PI * radii[i];
            System.out.printf("The area is %.2f with a radius of %d%n", area, radii[i]);
        }
    }

    void task_c_3() {
        double[] dTemp = new double[]{21.5, 23.7, 19.6, 22.5, 25.3, 21.7, 18.9};
        for (int i = 1; i < dTemp.length; i++) {
            System.out.println(dTemp[i] - dTemp[i - 1]);
        }
    }

    void task_c_4() {
        int[] month = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner input = new Scanner(System.in);
        int userInput;
        while (true) {
            System.out.println("Enter a value correlating to a month");
            if (input.hasNextInt()) {
                userInput = input.nextInt();
                if (!(userInput < 1 || userInput > 12)) {
                    System.out.printf("The number of days in the requested month is %d%n", month[userInput - 1]);
                    break;
                }
            }
        }
    }

    void task_c_5() {

    }

    void task_c_6() {

    }

    void task_c_7() {

    }
}
