package core_java.ClassesAndObjects.Level1;

public class AreaOfCircle {
    double radius;
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
    public static void main(String[] args) {
        AreaOfCircle c = new AreaOfCircle();
        c.radius = 7.0;
        c.displayDetails();
    }
}
