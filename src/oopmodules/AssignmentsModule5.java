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
/**
 * An assignment handler that runs the user requested task
 */
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
            "Opgave D.2",
            "Opgave D.5",
            "Opgave D.7(WIP)",
            "Opgave D.8"
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
            System.out.print("Enter an integer value: "); // requesting user input
            if (input.hasNextInt()) { // if the user inputs a valid number
                int[] primesCandidates = mersennePrime(input.nextInt()); //request mersenne primes and creates an array to store them
                System.out.println("A list of mersenne primes and their p value"); //prints headline
                System.out.printf("%-20s%-20s%n", "p", "2^p – 1"); // prints explanatory line
                System.out.println("________________________________________"); //Seperator line
                for (int x : primesCandidates) {//Loops thru all primes returned from the mersennePrime method
                    System.out.printf("%-20d%-20d%n", x, (long) (Math.pow(2, x) - 1)); // creates a line in the table and prints it
                }

                break; //breakes out of the task
            } else {
                input.next(); // clears the input and continues 
            }
        }
    }

    void task_d_2() {
        //Skriv et program, der udregner omkredsen (2*π*r) af 2 cirkler med radius 3 hhv. 7, og udskriver summen af disse.
        double sum = 0;
        double[] radii = new double[]{3, 7};
        for (double object : radii) {
            sum += circleCircumference(object);
        }
        System.out.println("The sum of the circumferre is " + sum);

    }

    void task_d_5() {
        /*  Skriv et program, der finder alle primtal mellem 100 og 200 og som har og benytter to metoder (ud over main):

            public static void init ()
            public static boolean isPrime(int potential)
         */
        System.out.println("List of primes between 100 and 200");
        for (int i : primes(100, 200)) {
            System.out.println(i);
        }

    }

    void task_d_7() {
        //Ekstraopgave D.7: Omskriv én løsning til opgave C.7 fra sidste uge til at benytte metoder. I kan bruge jeres egen løsning eller den vedhæftede.
    }

    void task_d_8() {
        // Skriv en metode der givet et 9x9 array af heltal bestemmer (via en boolsk returværdi) om der er tale om en gyldig Sudoku løsning, og skriv et program der benytter denne.
        int[][] suduku = new int[][]{
            {7, 3, 5, 6, 1, 4, 8, 9, 2},
            {8, 4, 2, 9, 7, 3, 5, 6, 1},
            {9, 6, 1, 2, 8, 5, 3, 7, 4},
            {2, 8, 6, 3, 4, 9, 1, 5, 7},
            {4, 3, 1, 8, 5, 7, 9, 2, 6},
            {5, 7, 9, 1, 2, 6, 4, 3, 8},
            {1, 5, 7, 4, 9, 2, 6, 8, 3},
            {6, 9, 4, 7, 3, 8, 2, 1, 5},
            {3, 2, 8, 5, 6, 1, 7, 4, 9}
        };
        for (int i = 0; i < suduku.length; i++) {
            for (int j = 0; j < suduku.length; j++) {
                System.out.printf((j == 0 ? "" : " ") + suduku[i][j]);
            }
            System.out.printf("%n");
        }
        System.out.println("The suduko yeilds " + (sudukoTest(suduku) ? "True" : "false"));
    }

    /**
     * Takes an integer, and sums all the digits in the integer
     *
     * @param n A positive integer with at max size of Long.MaxSize
     * @return Sum of digits in the input integer
     */
    public int sumDigits(long n) {
        int result = 0;
        for (char val : Long.toString(n).toCharArray()) {
            result += Character.getNumericValue(val);
            //Alternativly
            //result += val - '0';
        }
        return result;
    }

    /**
     * Takes a positive integer with a max size of Integer.MIN_VALUE and
     * reverses the digits
     *
     * @param number Positive integer with a max size of Integer.MAX_VALUE
     * @return Reverse of the input
     */
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

    /**
     * Checks if an integer value is a palindrome, and returns a boolean based
     * on this
     *
     * @param number {@literal Integer <= Integer.MAX_VALUE}
     * @return Bool of answer
     */
    public boolean isPalindrome(int number) {
        boolean result = false;
        if (number == reverse(number)) {
            result = true;
        }
        return result;
    }

    /**
     * Converts miles to kilometre
     *
     * @param mile A double value of miles
     * @return A double value of resulting kilometres
     */
    public double mileToKilometer(double mile) {
        double result = 0;
        result = mile * 1.6;
        return result;
    }

    /**
     * Converts kilometres to miles
     *
     * @param kilometer A double value of kilometres
     * @return A double value of the resulting miles
     */
    public double kilometerToMile(double kilometer) {
        double result = 0;
        result = kilometer / 1.6;
        return result;
    }

    /**
     * Finds the approximate square root of the input
     *
     * @param n Positive integer value smaller than Long.MAX_VALUE
     * @return Approximate square root of n
     */
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

    /**
     * Convertes milliseconds to a string of Hours:Minutes:Seconds
     *
     * @param millis An input in milliseconds smaller than Long.MAX_VALUE
     * @return A string of Hours:Minutes:Seconds based on millis
     */
    public String convertMillis(long millis) { //returns a string of Hours:Minutes:Seconds
        String results;
        long hours = millis / 3600000; //Extracting the whole numbner of hours
        long minutes = (millis % 3600000) / 60000; //Extracting the whole numbner of minutes
        long seconds = ((millis % 3600000) % 60000) / 1000; //Extracting the whole numbner of seconds
        results = String.format("%d:%d:%d", hours, minutes, seconds);
        return results;
    }
/**
 * Returns an array containing all mersennePrimes smaller than or equal to n
 * @param n Largest number to check for mersennePrimes
 * @return Array of mersennePrimes smaller than or queal to n
 */
    public int[] mersennePrime(int n) {
        //Returns array containing testet p values resulting in a prime

        boolean[] tests = new boolean[n]; //Contains whether or not an index + 2 contains a mersenne prime candidate
        int numberOfPrimes = 0; //Describes how many prime candidates were found

        for (int i = 2; i <= n; i++) { //Looping thru all possible candidates within the limit
            long testedPrime = (long) Math.pow(2, i) - 1; //Indicates the mersenne prime to be tested
            if (isPrime(testedPrime) == true) { // if no devisor is found indicate that this is a true mersenne prime candidate
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
/**
 * Returns the circumference of a circle based on the radius
 * @param radius Radius of the circle
 * @return Circumference of the circle
 */
    public double circleCircumference(double radius) {
        double result = 2 * radius * Math.PI;
        return result;
    }
/**
 * Returns whether of not the input is a prime
 * @param candidate A number to be tested for whether or not it is prime
 * @return Boolean based on whether or not candidate is a prime
 */
    public boolean isPrime(int candidate) {
        boolean result = true;
        for (int i = 2; i < Math.sqrt(candidate); i++) {
            if (candidate % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
    /**
     * Returns a list of primes within the specified inclusive range
     * @param start The smallest number to check
     * @param finish The largest number to check
     * @return An array of primes within the specified range
     */
    public int[] primes(int start, int finish) {
        int primeCount = 0;
        boolean[] testedPrimes = new boolean[finish - start];
        for (int i = start; i < finish; i++) {
            if (isPrime(i)) {
                testedPrimes[i - start] = true;
                primeCount++;
            }
        }
        int[] foundPrimes = new int[primeCount];

        for (int i = 0; i < foundPrimes.length; i++) {
            for (int j = 0; j < testedPrimes.length; j++) {
                if (testedPrimes[j] == true) {
                    testedPrimes[j] = false;
                    foundPrimes[i] = j + start;
                    break;
                }
            }
        }
        return foundPrimes;
    }
/**
 * Tests if a 9*9 jagged array is a valid suduko solution
 * @param suduko A 9*9 int jagged array
 * @return Boolean based on the validity of the input
 */
    public boolean sudukoTest(int[][] suduko) {
        boolean result = true;
        int[] val = new int[9];

        //Testing vertical 
        for (int j = 0; j < suduko.length; j++) {
            for (int i = 0; i < suduko.length; i++) {
                val[suduko[i][j] - 1]++;
            }
        }
        //Testing horisontal
        for (int j = 0; j < suduko.length; j++) {
            for (int i = 0; i < suduko.length; i++) {
                val[suduko[j][i] - 1]++;
            }
        }
        //Testing squares
        for (int i = 0; i <= 6; i += 3) {
            for (int j = 0; j <= 6; j += 3) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        val[suduko[i + k][j + l] - 1]++;
                    }
                }
            }
        }
        //checking suduko
        for (int x : val) {
            if (x != 27) {
                result = false;
            }
        }
        return result;
    }

}
