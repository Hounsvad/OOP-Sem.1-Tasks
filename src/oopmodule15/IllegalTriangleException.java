/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule15;

/**
 *
 * @author Pinnacle F
 */
public class IllegalTriangleException extends Exception{
    private String message = "The triangel is invalid";
    public IllegalTriangleException() {
        super("The triangel is invalid");
    }

    public IllegalTriangleException(String message) {
        super(message);
        this.message = message;
    }
    
//    public String getMessage(){
//        return "The triangel is invalid";
//    }
}
