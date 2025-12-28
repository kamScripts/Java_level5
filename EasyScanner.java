/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.javaedu;

/**
 *
 * @author kg00k
 */

import  java.util.Scanner;

public class EasyScanner
{
    private static final Scanner sc = new Scanner(System.in);

    public static int nextInt() {
        int value = sc.nextInt();
        sc.nextLine(); // consume newline
        return value;
    }

    public static double nextDouble() {
        double value = sc.nextDouble();
        sc.nextLine(); // consume newline
        return value;
    }

    public static char nextChar() {
        char c = sc.next().charAt(0);
        sc.nextLine(); // consume newline
        return c;
    }

    public static String nextString() {
        return sc.nextLine();
    }

}

