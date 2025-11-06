package Wrapper_class.Scenerio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeDataProcessing {

    public static void main(String[] args) {
        int[] employeeAgesPrimitive = {35, 22, 48, 29, 51, 30, 25, 60, 42};
        System.out.println("int[] array= " + Arrays.toString(employeeAgesPrimitive));
        List<Integer> employeeAgesList = Arrays.stream(employeeAgesPrimitive).boxed()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println("ArrayList<Integer>= " + employeeAgesList);
        if (employeeAgesList.isEmpty()) {
            System.out.println("Can't find Youngest and Oldest Age, list is empty!!");
            return;
        }
        int youngestAge = Collections.min(employeeAgesList);
        int oldestAge = Collections.max(employeeAgesList);
        System.out.println("Youngest Employee Age= " + youngestAge);
        System.out.println("Oldest Employee Age= " + oldestAge);
    }
}