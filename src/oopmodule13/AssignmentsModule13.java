/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule13;

import java.io.File;
import java.util.Date;

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
        File Module13File = new File("C:\\OOPRecources\\Module13File.csv");
        if(!Module13File.exists()){
            
        }
        System.out.printf("---------------------|%-19s %12s|---------------------%n", "End of assignment", "Todays assignment");
    }
}
