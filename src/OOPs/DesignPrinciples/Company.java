package OOPs.DesignPrinciples;

// Company.java
import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Department> departments; // Company has Departments

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Add a department to the company
    public Department addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept; // return department to add employees
    }

    // Display company info
    public void displayCompanyInfo() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.displayDepartmentInfo();
        }
    }
}
