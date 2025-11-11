package Maps;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> gradeTracker = new HashMap<>();
        gradeTracker.put("Alice", 85.5);
        gradeTracker.put("Charlie", 72.0);
        gradeTracker.put("Bob", 91.5);
        gradeTracker.put("David", 65.0);
        System.out.println("Current Grades: " + gradeTracker);
        String studentToUpdate = "Bob";
        double newGrade = 95.0;
        gradeTracker.put(studentToUpdate, newGrade);
        System.out.println("Updating " + studentToUpdate + "'s grade to " + newGrade);
        System.out.println("Current Grades: " + gradeTracker);
        String studentToRemove = "David";
        gradeTracker.remove(studentToRemove);
        System.out.println("Removing student: " + studentToRemove);
        System.out.println("Current Grades: " + gradeTracker);
        Map<String, Double> sortedGrades = new TreeMap<>(gradeTracker);
        System.out.println("Printing Grades in Alphabetical Order:");
        for (Map.Entry<String, Double> entry : sortedGrades.entrySet()) {
            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
        }
    }
}