/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule8;

/**
 *
 * @author Pinnacle F
 */
public class Fan {

    /**
     * Indicates slow speed
     */
    private int SLOW = 1;
    /**
     * Indicates medium speed
     */
    private int MEDIUM = 2;
    /**
     * Indicates fast speed
     */
    private int FAST = 3;
    /**
     * Denotes the fan speed
     */
    private int speed = SLOW;
    /**
     * Denotes whether the fan is on
     */
    private boolean on = false;
    /**
     * Indicates the radius of the fan
     */
    private double radius = 5.0;
    /**
     * Denotes the colour of the fan
     */
    private String colour = "Blue";

    /**
     * Gets the colour of the fan
     *
     * @return Returns the colour of the fan as a string
     */
    public String getColour() {
        return colour;
    }

    /**
     * Sets the colour of the fan
     *
     * @param colour colour of the fan as a string
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * Gets the radius of the fan
     *
     * @return Returns a double representing the radius of the fan
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the fan
     *
     * @param radius radius of the fan as a double
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Gets the speed setting of the fan
     *
     * @return an int representing the speed setting of the fan
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the speed setting of the fan
     *
     * @param speed an int representing the speed setting of the fan
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Gets the state of the fan
     *
     * @return a boolean representing the on-state of the fan
     */
    public boolean isOn() {
        return on;
    }

    /**
     * Sets the state of the fan
     *
     * @param on a boolean representing the on-state of the fan
     */
    public void setOn(boolean on) {
        this.on = on;
    }
    /**
     * Walla
     * @return kebab
     */
    public String toString(){
        return String.format("%1$-20s" + "%5$10d" + "%n" +
                             "%2$-20s" + "%6$10s" + "%n" +
                             "%3$-20s" + "%7$10.3f" + "%n" +
                             "%4$-20s" + "%8$10s" + "%n", 
                             "Fan speed:",
                             "Fan colour:",
                             "Fan radius:",
                             "Fan on-state:",
                             this.speed,
                             this.colour,
                             this.radius,
                             this.on ? "On" : "Off");
    }
}
