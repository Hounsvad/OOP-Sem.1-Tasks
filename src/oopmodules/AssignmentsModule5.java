/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodules;

import java.util.Scanner;

/**
 *
 * @author Hounsvad
 */
public class AssignmentsModule5 {

    public void assignmentStarter() {
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
                    task_Liang6_2();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 2:
                    task_Liang6_3();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 3:
                    task_Liang6_8();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 4:
                    task_Liang6_22();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 5:
                    task_Liang6_25();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 6:
                    task_Liang6_28();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 7:
                    task_d_2();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 8:
                    task_d_5();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 9:
                    task_d_7();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 10:
                    task_d_8();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                default:

            }
        }
    }

    void task_Liang6_2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        if (input.hasNextLong()) {
            System.out.println("The sum of the digits is" + (sumDigits(input.nextLong())));
        }
    }

    void task_Liang6_3() {

    }

    void task_Liang6_8() {

    }

    void task_Liang6_22() {

    }

    void task_Liang6_25() {

    }

    void task_Liang6_28() {

    }

    void task_d_2() {
        //Skriv et program, der udregner omkredsen (2*π*r) af 2 cirkler med radius 3 hhv. 7, og udskriver summen af disse.
    }

    void task_d_5() {
        /*  Skriv et program, der finder alle primtal mellem 100 og 200 og som har og benytter to metoder (ud over main):

            public static void init ()
            public static boolean isPrime(int potential)
         */

    }

    void task_d_7() {
        //Ekstraopgave D.7: Omskriv én løsning til opgave C.7 fra sidste uge til at benytte metoder. I kan bruge jeres egen løsning eller den vedhæftede.
    }

    void task_d_8() {
        // Skriv en metode der givet et 9x9 array af heltal bestemmer (via en boolsk returværdi) om der er tale om en gyldig Sudoku løsning, og skriv et program der benytter denne.
    }

    public int sumDigits(long n) {
        int result = 0;
        for (char val : Long.toString(n).toCharArray()) {
            result += Character.getNumericValue(val);
            //Alternativly
            //result += val - '0';
        }
        return result;
    }

}
