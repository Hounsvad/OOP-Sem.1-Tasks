/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule18;

/**
 *
 * @author Pinnacle F
 */
public class Contact {
    
    String email;
    String phoneNumber;
    String name;
    String sirname;
    String zip;
    String address;

    public Contact(String name, String sirname, String email, String phoneNumber, String zip, String address) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.sirname = sirname;
        this.zip = zip;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSirname() {
        return sirname;
    }

    public void setSirname(String sirname) {
        this.sirname = sirname;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return (this.sirname + ", " + this.name); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
