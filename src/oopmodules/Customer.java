/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodules;

/**
 *
 * @author Pinnacle F
 */
public class Customer {

    String name;
    int id;
    double balance;
    
    /**
     * Creates a customer with a given name and id and gives the customer a balance of 0
     * @param _name A customer name in the form of a string
     * @param _id A customer id in the form of an int
     */
    Customer(String _name, int _id) {
        name = _name;
        id = _id;
        balance = 0.0;
    }
    /**
     * Creates a customer with a given name, id and balance
     * @param _name A customer name in the form of a string
     * @param _id A customer id in the form of an int
     * @param _balance A customer balance in the form of a double
     */
    Customer(String _name, int _id, double _balance) {
        name = _name;
        id = _id;
        balance = _balance;
    }

    /**
     * Deposits a given amount into the balance of the customer
     * @param amount An amount in the form of a double to be entered into the customers balance
     */
    public void deposit(double amount) {
        balance += amount;
    }
    /**
     * withdraws a given amount into the balance of the customer
     * @param amount An amount in the form of a double to be deducted from the customers balance
     */
    public void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
        }

    }
    /**
     * Returns the customers balance as a double 
     * @return A double value resembling the customers balance
     */
    public double getBalance() {
        return balance;
    }
}
