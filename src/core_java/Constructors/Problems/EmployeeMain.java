package core_java.Constructors.Problems;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary updated to: " + salary);
        } else {
            System.out.println("Invalid salary!");
        }
    }
}
class Manager extends Employee {
    private String teamName;
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }
    public void showDetails() {
        System.out.println("Manager ID= " + employeeID);
        System.out.println("Department= " + department);
        System.out.println("Salary= " + getSalary());
        System.out.println("Team Name= " + teamName);
    }
}
public class EmployeeMain {
    public static void main(String[] args) {
        Manager mgr = new Manager(101, "IT", 60000.0, "AI Team");
        mgr.showDetails();
        mgr.setSalary(75000.0);
        System.out.println("Updated Salary= " + mgr.getSalary());
    }
}
