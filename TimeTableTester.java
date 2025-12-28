/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.javaedu;

/**
 *
 * @author kg00k
 */
public class TimeTableTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TimeTable t = new TimeTable(5,7);
        boolean res = t.makeBooking(0, 1, new Booking("5", "Kam"));
        System.out.println(res);
        System.out.println(t.cancelBooking(0, 1));
        t.makeBooking(0, 1, new Booking("5", "Maxi"));
        System.out.println(t.getBooking(0, 1).getName());
        
    }
    
}
