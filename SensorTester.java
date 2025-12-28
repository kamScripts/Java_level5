/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.javaedu;

/**
 *
 * @author kg00k
 */
public class SensorTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Sensor s = new Sensor();
       Sensor r = new Sensor(20.5);
       
       if (s.setPressure(-4.2)) {
           System.out.println("Pressure successfully set");
       }
       else {
           System.out.println("Incorect pressure value");
       }
       if (r.setPressure(99.0)) {
           System.out.println("Pressure successfully set");
       }
       else {
           System.out.println("Incorect pressure value");
       }
       System.out.println(String.format(
               "s pressure: %.2f, r pressure: %.2f",
               s.getPressure(),r.getPressure()));
    }
    
}
