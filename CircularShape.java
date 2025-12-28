/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.javaedu;

/**
 *
 * @author kg00k
 */
public class CircularShape {
    private double r;
    
    public CircularShape(double rIn) {
        r = rIn;
    }

    public double getRadius() {
        return r;
    }

    public void setRadius(double rIn) {
        this.r = rIn;
    }
    public double diameter() {
        return 2 * r;
    }
    public double area() {
        return Math.PI * r * r;
    }
    public double circumference() {
        return Math.PI * r * 2;
    }
    
}
