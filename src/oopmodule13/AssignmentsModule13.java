/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Hounsvad
 */
public class AssignmentsModule13 {

    /**
     * An assignment handler that runs the user requested task
     */
    public void assignmentStarter() {
        task();
    }

    void task() {
        System.out.printf("---------------------|%-19s %12s|---------------------%n", "Start of assignment", "Todays assignment");
        File module13File = new File("C:\\OOPRecources\\Module13File.csv");
        String input = "1,2,red,blue";
        PrintWriter pw = null;
        Scanner r;
        if(module13File.exists()){
            try {
                pw = new PrintWriter(module13File);
                pw.print(input);
                pw.close();
            } catch (FileNotFoundException e) {
                System.out.println("The file was not found.");
                pw.close();
            }
            try {
               r = new Scanner(module13File).useDelimiter(",");
               System.out.println(r.nextInt());
               System.out.println(r.nextInt());
               System.out.println(r.next());
               System.out.println(r.next());
            } catch (FileNotFoundException e) {
                r = null;
                System.out.println("The file was not found");
            }
        }else{
            System.exit(0);
        }
        System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", "Todays assignment");
    }
}
