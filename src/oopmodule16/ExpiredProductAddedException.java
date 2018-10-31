/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule16;

import oopmodule15.*;

/**
 *
 * @author Pinnacle F
 */
public class ExpiredProductAddedException extends Exception{

    /**
     * Exception with the message: Attempted to add expired product to database
     */
    public ExpiredProductAddedException() {
        super("Attempted to add expired product to database");
    }

    public ExpiredProductAddedException(String message) {
        super(message);
    }        
}
