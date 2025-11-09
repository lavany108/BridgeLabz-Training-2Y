package Exceptions;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExamSubmission {
    private static final LocalDateTime DEADLINE = LocalDateTime.of(2025, 11, 15, 23, 59);
    private static final String REQUIRED_EXTENSION = ".pdf";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    public void submitExam(String fileName, LocalDateTime submissionTime)
            throws InvalidFileFormatException, LateSubmissionException {
        if (!fileName.toLowerCase().endsWith(REQUIRED_EXTENSION)) {
            throw new InvalidFileFormatException(
                    "The file '" + fileName + "' has an invalid format. Only " + REQUIRED_EXTENSION + " files are accepted."
            );
        }
        if (submissionTime.isAfter(DEADLINE)) {
            throw new LateSubmissionException(
                    "Submission attempted at " + submissionTime.format(FORMATTER) +
                            ". The deadline was " + DEADLINE.format(FORMATTER) + "."
            );
        }
        System.out.println("Submission Successful! File: " + fileName + " at " + submissionTime.format(FORMATTER));
    }

    public static void main(String[] args) {
        ExamSubmission system = new ExamSubmission();
        LocalDateTime earlyTime = DEADLINE.minusHours(1);
        LocalDateTime lateTime = DEADLINE.plusMinutes(10);
        System.out.println("Deadline: " + DEADLINE.format(FORMATTER));
        try {
            system.submitExam("Student_A_Paper.pdf", earlyTime);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {
            system.submitExam("Student_B_Paper.docx", earlyTime);
        } catch (InvalidFileFormatException e) {
            System.err.println("Submission failed! invalid file format.");
            System.err.println("Detail: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected Error: " + e.getMessage());
        }
        try {
            system.submitExam("Student_C_Paper.pdf", lateTime);
        } catch (LateSubmissionException e) {
            System.err.println("Submission failed! " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected Error: " + e.getMessage());
        }
    }
}