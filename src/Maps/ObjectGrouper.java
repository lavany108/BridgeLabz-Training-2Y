package Maps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectGrouper {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR"),
                new Employee("David", "IT")
        );
        Map<String, List<Employee>> employeesByDept = new HashMap<>();
        for (Employee emp : employees) {
            String dept = emp.getDepartment();
            if (employeesByDept.containsKey(dept)) {
                List<Employee> departmentList = employeesByDept.get(dept);
                departmentList.add(emp);
            } else {
                List<Employee> newDepartmentList = new ArrayList<>();
                newDepartmentList.add(emp);
                employeesByDept.put(dept, newDepartmentList);
            }
        }
        System.out.println("Employees Grouped by Department:-");
        System.out.println(employeesByDept);
    }
}