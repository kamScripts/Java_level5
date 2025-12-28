/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.javaedu;

/**
 *
 * @author kg00k
 */
public class IncubatorTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Incubator i = new Incubator();
        
        for (int j=0;j<21;j++){
            System.out.println(i.getTemp());
            System.out.println(i.decrementTemp());
        }
    }
    
}
