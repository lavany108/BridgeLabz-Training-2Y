package core_java.Level1_11sep;

class Student {
    static String universityName = "GLA University";
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;
    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
    public void displayDetails(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Name: " + s.name);
            System.out.println("Grade: " + s.grade);
        } else {
            System.out.println("Invalid object! Not a Student.");
        }
    }
    public void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.grade = newGrade;
            System.out.println("Grade updated successfully for " + s.name);
        } else {
            System.out.println("Invalid object! Cannot update grade.");
        }
    }
}
public class StudentDemo {
    public static void main(String[] args) {
        Student st1 = new Student(101, "Aarav", "A");
        Student st2 = new Student(102, "Isha", "B");
        st1.displayDetails(st1);
        st2.displayDetails(st2);
        st1.updateGrade(st1, "A+");
        st1.displayDetails(st1);
        Student.displayTotalStudents();
        st2.displayDetails("Not a Student");
    }
}
