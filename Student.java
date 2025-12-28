/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.javaedu;

/**
 *
 * @author kg00k
 */
public class Student {
    private final String studentNumber;
    private final String studentName;
    private int markForMath;
    private int markForEnglish;
    private int markForScience;
    private static double fee=9250.0;
    
    public Student (String numIn, String nameIn) {
        studentNumber=numIn;
        studentName=nameIn;
        //Marks initialy set phoney value to indicate required initialization
        markForMath= -999; 
        markForEnglish= -999;
        markForScience= -999;
    }

    public String getNum() {
        return studentNumber;
    }

    public String getName() {
        return studentName;
    }

    public int getMarkForMath() {
        return markForMath;
    }

    public int getMarkForEnglish() {
        return markForEnglish;
    }

    public int getMarkForScience() {
        return markForScience;
    }

    public static double getFee() {
        return fee;
    }

    public static void setFee(double fee) {
        Student.fee = fee;
    }
    public void enterMarks(int math, int eng, int science) {
        markForMath = math;
        markForEnglish = eng;
        markForScience = science;
    }
    public double avgMark() {
        if (markForMath > 0 && markForEnglish > 0 && markForScience > 0){
            return (markForMath+markForEnglish+markForScience)/3.0;
        }
        return -999;
    }
    
}