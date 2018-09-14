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
        boolean found = false;
        int lastPrime = 0;
//        long time = System.nanoTime();
        for (int i = 3; i < 1000000; i += 2) {
            found = false;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                lastPrime = i;
            }
        }
        System.out.println(lastPrime);
        //System.out.println(((double) (System.nanoTime() - time)) / 1000000000 + " Seconds");
    }

    void task_c_6() {
        double[] inputArray = new double[]{22.0, 23.5, 55.0, 95.0};
        double highest = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < highest) {
                highest = inputArray[i];
            }
        }
    }

    void task_c_7() {
        int[][] buffer = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        int[][] current = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        while (true) {
            for (int i = 0; i < current.length; i++) {
                for (int j = 0; j < current[i].length; j++) {
                    int liveNeighbers = 0;
                    //System.out.printf("i: %d j: %d  iLenghth: %d jLength: %d%n", i, j, current.length, current[i].length);
                    if (i != 0 && j != 0) {
                        //Top left
                        liveNeighbers += current[i - 1][j - 1];
                    }
                    if (i != 0) {
                        //Top mid
                        liveNeighbers += current[i - 1][j];
                    }
                    if (i > 0 && j < (current[i].length-1)) {
                        //Top right
                        liveNeighbers += current[i - 1][j + 1];
                    }
                    if (j != 0) {
                        //Left
                        liveNeighbers += current[i][j - 1];
                    }
                    if (j < (current[i].length-1)) {
                        //Right
                        liveNeighbers += current[i][j + 1];
                    }
                    if (i < (current.length-1) && j != 0) {
                        //Lower left
                        liveNeighbers += current[i + 1][j - 1];
                    }
                    if (i < (current.length-1)) {
                        //Lower mid
                        liveNeighbers += current[i + 1][j];
                    }
                    if (i < (current.length-1) && j < (current[i].length-1)) {
                        //Lower right
                        liveNeighbers += current[i + 1][j + 1];
                    }
                    //System.out.println("Live Neighbers " + liveNeighbers);
                    if (liveNeighbers > 3 || liveNeighbers < 2) {
                        buffer[i][j] = 0;
                    } else if (liveNeighbers == 3 || liveNeighbers == 2) {
                        buffer[i][j] = 1;
                    }
                }
            }
            //System.out.println("End of for");
            for (int i = 0; i < current.length; i++) {
                for (int j = 0; j < current[i].length; j++) {
                    current[i][j] = buffer[i][j];
                }
            }
            for (int i = 0; i < current.length; i++) {
                for (int j = 0; j < current[i].length; j++) {
                    System.out.printf("%d", current[i][j]);
                }
                System.out.printf("%n");
            }
            System.out.println("");
        }
    }
}
