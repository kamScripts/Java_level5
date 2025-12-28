/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.javaedu;

/**
 *
 * @author kg00k
 */
public class Sensor {
    // attribute
    private double pressure;
    //Constructors
    public Sensor(double pressure) {
        this.pressure = pressure;
    }
    public Sensor() {
    }    
    // Get & Set methods
    public double getPressure() {
        return pressure;
    }

    public boolean setPressure(double pressure) {
        if (pressure >= 0){
            this.pressure = pressure;
            return true;
        }
        return false;
    }
    
}
