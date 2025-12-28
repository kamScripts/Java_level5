package oop.javaedu;

/**
 *
 * @author kg00k
 */
public class StudentTester {

    public static void main(String[] args) {
        Student[] studentArr = {
            new Student("1", "Kamil"),
            new Student("2", "Kasia"),
            new Student("3", "Mia"),
            new Student("4", "Maxi")
        };
        Student.setFee(8000);
        System.out.println(Student.getFee());
        studentArr[0].enterMarks(90, 87, 93);
        studentArr[1].enterMarks(90, 86, 70);
        studentArr[2].enterMarks(99, 98, 99);
        studentArr[3].enterMarks(41, 57, 44);

        for (Student s : studentArr) {
            String msg = String.format("""
                                   %s marks:
                                   Maths: %8d
                                   Science: %6d
                                   English: %6d
                                   Average: %8.1f
                                   """,
                    s.getName(),
                    s.getMarkForMath(),
                    s.getMarkForScience(),
                    s.getMarkForEnglish(),
                    s.avgMark());
            System.out.println(msg);
        }
        Student s4 = new Student("4", "John");
        System.out.println(s4.avgMark());
    }

}
