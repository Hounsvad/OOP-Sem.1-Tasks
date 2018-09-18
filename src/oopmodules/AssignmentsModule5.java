/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodules;

import java.util.Arrays;
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
            "Liang 6.2",
            "Liang 6.3",
            "Liang 6.8",
            "Liang 6.22",
            "Liang 6.25",
            "Liang 6.28",
            "Opgave c.2",
            "Opgave c.5",
            "Opgave c.7",
            "Opgave c.8"
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
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        if (input.hasNextInt()) {
            System.out.printf("The input is%s a palindrome%n", (isPalindrome(input.nextInt())) ? "" : " not");
        }
    }

    void task_Liang6_8() {
        double mile = 1;
        double kilometer = 20;
        System.out.printf("%-20s%-20s|%20s%20s%n", "Miles", "Kilometers", "Kilometers", "Miles");
        System.out.println("_________________________________________________________________________________");
        while (mile <= 10) {
            System.out.printf("%-20.2f%-20.2f|%20.2f%20.2f%n", mile, mileToKilometer(mile), kilometer, kilometerToMile(kilometer));
            mile += 1;
            kilometer += 5;
        }
    }

    void task_Liang6_22() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        if (input.hasNextLong()) {
            System.out.println("The square root is " + sqrt(input.nextLong()));
        }
    }

    void task_Liang6_25() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer value: ");
            if (input.hasNextLong()) {
                System.out.println(convertMillis(input.nextLong()));
                break;
            } else {
                input.next();
            }
        }
    }

    void task_Liang6_28() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer value: ");
            if (input.hasNextInt()) {
                int[] primesCandidates = mersennePrime(input.nextInt());
                System.out.println("A list of mersenne primes and their p value");
                System.out.printf("%-20s%-20s%n", "p", "2^p – 1");
                System.out.println("________________________________________");
                for (int x : primesCandidates) {
                    System.out.printf("%-20d%-20d%n", x, (long) (Math.pow(2, x) - 1));
                }

                break;
            } else {
                input.next();
            }
        }
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

    public int reverse(int number) {
        int result = 0;
        char[] numberInput = Integer.toString(number).toCharArray();
        char[] numberOutput = new char[numberInput.length];
        String numberOutputString = "";
        for (int i = 0; i < numberOutput.length; i++) {
            numberOutput[i] = numberInput[numberInput.length - i - 1];
        }
        for (char x : numberOutput) {
            numberOutputString += x;
        }
        result = Integer.parseInt(numberOutputString);
        return result;
    }

    public boolean isPalindrome(int number) {
        boolean result = false;
        if (number == reverse(number)) {
            result = true;
        }
        return result;
    }

    public double mileToKilometer(double mile) {
        double result = 0;
        result = mile * 1.6;
        return result;
    }

    public double kilometerToMile(double kilometer) {
        double result = 0;
        result = kilometer / 1.6;
        return result;
    }

    public double sqrt(long n) {
        double result = 0;
        double lastGuess = n;
        double nextGuess = n;
        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + (n / lastGuess)) / 2;
            //System.out.printf("lastGuess: %.5f nextGuess: %.5f%n",lastGuess, nextGuess);
        } while (Math.abs(nextGuess - lastGuess) > 0.0000000000001);
        result = lastGuess;
        return result;
    }

    public String convertMillis(long millis) {
        String results;
        long hours = millis / 3600000;
        long minutes = (millis % 3600000) / 60000;
        long seconds = ((millis % 3600000) % 60000) / 1000;
        results = String.format("%d:%d:%d", hours, minutes, seconds);
        return results;
    }

    public int[] mersennePrime(int n) {
        //Returns array containing testet p values resulting in a prime
        
        
        boolean[] tests = new boolean[n]; //Contains whether or not an index + 2 contains a mersenne prime candidate
        int numberOfPrimes = 0; //Describes how many prime candidates were found

        
        for (int i = 2; i <= n; i++) { //Looping thru all possible candidates within the limit
            boolean found = false;
            long testedPrime = (long) Math.pow(2, i) - 1; //Indicates the mersenne prime to be tested
            for (long j = 2; j <= Math.sqrt(testedPrime); j++) { // testing all numbers against the mersenne prime candidate
                if (testedPrime % j == 0) {// if a devisor is found the loop breaks and the candidate is discarded
                    found = true;
                    break;
                }

            }
            if (found != true) { // if no devisor is found indicate that this is a true mersenne prime candidate
                tests[i - 2] = true;
                numberOfPrimes++; // increment the number of primes found
            }
        }
        int[] result = new int[numberOfPrimes]; //Declaring the results array
        
        for (int i = 0; i < result.length; i++) { //looping thru the results array
            for (int j = 0; j < tests.length; j++) {//looping thru the tests array
                if (tests[j] == true) {// if the test resulted in a true mersenne prime
                    tests[j] = false; // remove said prime from the list
                    result[i] = j + 2; // add the index of test + 2( to give the mersenne prime candidate) to the results list
                    break; // break loop so as not to override
                }
            }
        }
        return result;
    }

}
