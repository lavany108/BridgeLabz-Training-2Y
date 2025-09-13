package core_java.Constructors.Level1;

class Circle {
    double radius;
    Circle() {
        this(1.0);
    }
    Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);
        System.out.println("Area1= " + c1.calculateArea());
        System.out.println("Area2= " + c2.calculateArea());
    }
}
