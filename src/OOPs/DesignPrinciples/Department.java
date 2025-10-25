package OOPs.DesignPrinciples;
// Department.java
import java.util.ArrayList;

public class Department {
    private String deptName;
    private ArrayList<Employee> employees; // Department has Employees

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    // Add an employee to the department
    public void addEmployee(String name, int id) {
        Employee emp = new Employee(name, id);
        employees.add(emp);
    }

    // Display department info
    public void displayDepartmentInfo() {
        System.out.println("Department: " + deptName);
        for (Employee emp : employees) {
            emp.displayInfo();
        }
    }
}
