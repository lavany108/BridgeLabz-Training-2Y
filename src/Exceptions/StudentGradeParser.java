package Exceptions;
import java.util.ArrayList;
import java.util.List;

public class StudentGradeParser {
        public static void main(String[] args) {
            List<String> Grades = List.of("90", "A+", "85", "100", "B-", "78");
            List<Integer> validScores = new ArrayList<>();
            System.out.println("Grades: " + Grades);
            for (String grade : Grades) {
                try {
                    int score = Integer.parseInt(grade);
                    validScores.add(score);
                    System.out.println("Parsed Grades: " + grade + " -> " + score);

                } catch (NumberFormatException e) {
                    System.err.println("Invalid grades: " + grade);
                }
            }
            System.out.println("Valid Grades: " + validScores);
            System.out.println("Total Invalid Entries: " + (Grades.size() - validScores.size()));
        }
    }