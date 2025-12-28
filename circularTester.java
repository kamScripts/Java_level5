/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.javaedu;

/**
 *
 * @author kg00k
 */
public class circularTester {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        char choice;
        CircularShape c = null;   // initialize it

        do {
            System.out.println("Select one of following options: ");
            System.out.println("""
                           1. New Circle
                           2. Display data
                           3. Quit
                           """);
            choice = EasyScanner.nextChar();

            switch (choice) {
                case '1' -> c = option1(c);
                case '2' -> option2(c);
                case '3' -> {}
                default -> System.out.println("Invalid entry");
            }

        } while (choice != '3');
}

    static CircularShape option1(CircularShape obj) {
        System.out.println("Select radius: ");
        double r = EasyScanner.nextDouble();
        if (obj == null) {
            CircularShape c = new CircularShape(r);
            return c;
        }
        else {
            obj.setRadius(r);
            return obj;
        }
        
    }
    static void option2(CircularShape obj) {
    if (obj == null) {
        System.out.println("No circle created yet!");
        return;
    }

    System.out.println("Radius = " + obj.getRadius() + " Diameter = " + obj.diameter());
    System.out.println("Area = " + obj.area());
    System.out.println("Circumference = " + obj.circumference());
}

    
}
