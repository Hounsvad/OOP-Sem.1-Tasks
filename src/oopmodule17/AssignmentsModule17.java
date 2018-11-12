/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule17;

/*
 *
 * @author Hounsvad
 */
import oopmodule17.chapter2.Chapter2;
import oopmodule17.chapter4.Chapter4;
import oopmodule17.chapter1.Chapter1;
import java.util.Scanner;
public class AssignmentsModule17{

        public void assignmentStarter() {
            Scanner input = new Scanner(System.in);
        int userInputInt = -1;
        String userInputString = "";
        String[] assignments = new String[]{
            "Chapter 1",
            "Chapter 2",
            "Chapter 4"
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
                    Chapter1 c1 = new Chapter1();
                    c1.begin();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 2:
                    Chapter2 c2 = new Chapter2();
                    c2.begin();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                case 3:
                    Chapter4 c4 = new Chapter4();
                    c4.begin();
                    System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", assignments[userInputInt - 1]);
                    break;
                default:
            }
        }

    }
    

}
