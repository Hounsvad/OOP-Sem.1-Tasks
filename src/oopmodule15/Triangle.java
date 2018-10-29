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
public class Triangle {
    private double side1, side2, side3 = 1.0;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
        if(side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1){
            throw new IllegalTriangleException();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    
    public double getArea(){
        double p = (this.side1 + this.side2 + this.side3)/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    @Override
    public String toString(){
        return String.format("Side1: %f, Side2: %f, Side3: %f", side1, side2, side3);
    }
}
