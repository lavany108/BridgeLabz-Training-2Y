package OOPs.DesignPriciples;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a company
        Company myCompany = new Company("Tech Solutions");

        // Add departments
        Department devDept = myCompany.addDepartment("Development");
        Department hrDept = myCompany.addDepartment("HR");

        // Add employees to departments
        devDept.addEmployee("Alice", 101);
        devDept.addEmployee("Bob", 102);

        hrDept.addEmployee("Charlie", 201);
        hrDept.addEmployee("Diana", 202);

        // Display all company info
        myCompany.displayCompanyInfo();

        // When myCompany is deleted, all departments and employees are also deleted automatically
        myCompany = null; // triggers garbage collection eventually
        System.out.println("\nCompany object deleted, departments and employees will also be removed by Java GC.");
    }
}
