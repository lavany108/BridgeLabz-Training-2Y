package core_java.Level1_11sep;

class Employee {
    static String companyName = "Tech Solutions Pvt Ltd";
    static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;
    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    void displayDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            System.out.println("Company: " + companyName);
            System.out.println("Employee ID: " + e.id);
            System.out.println("Name: " + e.name);
            System.out.println("Designation: " + e.designation);
        } else {
            System.out.println("Not an Employee object!");
        }
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Alice", "Developer");
        Employee e2 = new Employee(102, "Bob", "Designer");
        e1.displayDetails(e1);
        e2.displayDetails(e2);
        Employee.displayTotalEmployees();
        e1.displayDetails("Not an Employee");
    }
}
