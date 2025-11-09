package Exceptions;

import java.io.IOException;
import java.util.Random;

public class ExamSystem {
    private static final String VALID_ID = "S101";
    public void validateStudent(String studentID) throws InvalidStudentException {
        if (!studentID.equals(VALID_ID)) {
            throw new InvalidStudentException(
                    "Validation failed: Student ID '" + studentID + "' is not recognized."
            );
        }
        System.out.println("Student validation successful.");
    }
    public void submitExam(String studentID, String fileName)
            throws InvalidStudentException, IOException {
        validateStudent(studentID);
        Random random = new Random();
        if (random.nextInt(10) < 3) {
            throw new IOException(
                    "Could not establish a secure connection to the submission server."
            );
        }

        System.out.println("Exam submission successful.");
    }
    public static void main(String[] args) {
        ExamSystem system = new ExamSystem();
        try {
            system.submitExam("S999", "paper_S999.pdf");
        } catch (InvalidStudentException e) {
            System.err.println( e.getMessage());
        } catch (IOException e) {
            System.err.println( e.getMessage());
        } finally {
            System.out.println("Submission process completed.");
        }
        try {
            system.submitExam(VALID_ID, "paper_S101.pdf");
        } catch (InvalidStudentException e) {
            System.err.println( e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Exam submission process completed.");
        }
    }
}