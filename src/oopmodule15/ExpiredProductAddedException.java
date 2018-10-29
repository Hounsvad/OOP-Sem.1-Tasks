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
public class ExpiredProductAddedException extends Exception{

    public ExpiredProductAddedException() {
        super("Attempted to add expired product ot database");
    }

    public ExpiredProductAddedException(String message) {
        super(message);
    }        
}
