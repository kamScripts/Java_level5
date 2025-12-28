/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.javaedu;

/**
 *
 * @author kg00k
 */
public class ApartmentTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Apartment apt = new Apartment();
        Oblong [] roomsList = {
            new Oblong(5,5),
            new Oblong(10,6),
            new Oblong(4,8),
            new Oblong(5,4)
        };
        for (Oblong room : roomsList) {
            apt.addRoom(room);
        }
        for (int i=0;i<roomsList.length;i++){
            System.out.println(String.format(
        "Room Area: %.2f sq. m.; Length: %.2f m.; Width: %.2f m.",
           apt.getRoomArea(i), apt.getRoomLength(i),
           apt.getRoomHeight(i)));
        }
    }
    
}
