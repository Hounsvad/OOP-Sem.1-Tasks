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

    Customer(String _name, int _id) {
        name = _name;
        id = _id;
        balance = 0.0;
    }

    Customer(String _name, int _id, double _balance) {
        name = _name;
        id = _id;
        balance = _balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
        }

    }

    public double getBalance() {
        return balance;
    }
}
