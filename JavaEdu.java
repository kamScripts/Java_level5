

package oop.javaedu;

/**
 *
 * @author kg00k
 */
public class JavaEdu {

    public static void main(String[] args) {        
        //Bank bank = new Bank();
        //bank.addAccount("123", "Kamil");
        //System.out.println(bank.getItem("123").getAccountName());
        //BankApplication.run();
        CircularShape c = new CircularShape(5);
        System.out.println(
        "Radius = " + c.getRadius() + " Diameter = "+c.diameter());
        System.out.println(
        "Radius = " + c.getRadius() + " Area = "+c.area());
        System.out.println(
        "Radius = " + c.getRadius() + " Circumference = "+c.circumference());
    }
}
