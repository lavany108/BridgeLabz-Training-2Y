package core_java.ClassesAndObjects.Level1;

public class EmployeeDetails {
        String name;
        int id;
        double salary;

        // Method to display employee details
        void displayDetails() {
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Salary: " + salary);
        }

        public static void main(String[] args) {
            // Create an Employee object
            EmployeeDetails emp = new EmployeeDetails();
            emp.id = 101;
            emp.name = "John Doe";
            emp.salary = 50000;

            // Call method
            emp.displayDetails();
        }
}
