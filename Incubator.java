/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.javaedu;

/**
 *
 * @author kg00k
 */
public class Incubator {
    private int temp;
    public static int MAX = 10;
    public static int MIN = -10;

    public Incubator() {
        temp = 5;
    }

    public int getTemp() {
        return temp;
    }

    public boolean incrementTemp() {
        if (this.temp < 10) {
            this.temp++;
            return true;
        }
        return false;
    }
    public boolean decrementTemp() {
        if (this.temp > -10) {
            this.temp--;
            return true;
        }
        return false;
    }
    
    
    
    
    
}
