

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
        
        Student s1 = new Student("1", "Kam");
        s1.enterMarks(90, 95, 91);
        String msg = String.format("""
                                   %s marks:
                                     %7s: %6d
                                     Science: %6d
                                     English: %6d
                                     Average: %8.1f
                                   """,
                                   s1.getName(),
                                   "maths",
                                   s1.getMarkForMath(),
                                   s1.getMarkForScience(),
                                   s1.getMarkForEnglish(),
                                   s1.avgMark());
        System.out.println(msg);
        System.out.println("avg: "+s1.avgMark());
    }
}
