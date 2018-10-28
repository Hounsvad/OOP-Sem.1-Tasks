/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule08;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Hounsvad
 */
public class AssignmentsModule8 {

    /**
     * An assignment handler that runs the user requested task
     */
    public void assignmentStarter() {
        Scanner input = new Scanner(System.in);
        int userInputInt = -0;
        String userInputString = "";
        String[] assignments = new String[]{
            "Liang 9.3",
            "Liang 9.8",
            "Opgave A",
            "Opgave B",
            "Opgave C"
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
                    liang9_3();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 2:
                    liang9_8();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 3:
                    taskA();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 4:
                    taskB();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 5:
                    taskC();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                default:
            }
        }
    }

    void liang9_3() {
        Date dateObject = new Date();
        long[] numbers = new long[]{10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L};
        for (long number : numbers) {
            dateObject.setTime(number);
            System.out.println(dateObject.toString());
        }
    }

    void liang9_8() {
        Fan testFan1 = new Fan();
        Fan testFan2 = new Fan();

        testFan1.setColour("yellow");
        testFan1.setOn(true);

        testFan2.setColour("blue");
        testFan2.setOn(false);

        System.out.println(testFan1.toString());
        System.out.println(testFan2.toString());

    }

    void taskA() {
        Fan testFan1 = new Fan(1, true, 5, "Yellow");
        Fan testFan2 = new Fan(1, false, 5, "Blue");

        System.out.println(testFan1.toString());
        System.out.println(testFan2.toString());
    }

    void taskB() {
        Fan testFan1 = new Fan(1, true, 5, "Yellow");
        Fan testFan2 = new Fan(1, false, 5, "Blue");

        System.out.println(testFan1.toString());
        System.out.println(testFan2.toString());
    }

    void taskC() {
        Fan testFan1 = new Fan(1, true, 5, "Yellow");
        Fan testFan2 = new Fan(1, false, 5, "Blue");

        System.out.println(testFan1.toString());
        System.out.println(testFan2.toString());
    }
}
