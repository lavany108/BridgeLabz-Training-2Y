package Exceptions;

public class ReviewSystem {
    public void submitReview(int rating, String comment)
            throws InvalidRatingException, EmptyReviewException {
        if (rating < 1 || rating > 5) {
            throw new InvalidRatingException(
                    "Rating must be between 1 and 5. Received: " + rating
            );
        }
        if (comment == null || comment.trim().isEmpty()) {
            throw new EmptyReviewException(
                    "Review comment cannot be empty. Please provide feedback."
            );
        }
        System.out.println("Review Submitted Successfully!");
        System.out.println("Rating: " + rating + "/5 | Comment: \"" + comment + "\"");
    }
    public static void main(String[] args) {
        ReviewSystem system = new ReviewSystem();
        try {
            system.submitReview(6, "Great product!");
        } catch (InvalidRatingException e) {
            System.err.println(e.getMessage());
            System.out.println("select a rating between 1 and 5.");
        } catch (EmptyReviewException e) {
            System.err.println(e.getMessage());
        }
        try {
            system.submitReview(4, "");
        } catch (EmptyReviewException e) {
            System.err.println(e.getMessage());
            System.out.println("Enter text in the comment field.");
        } catch (InvalidRatingException e) {
            System.err.println(e.getMessage());
        }
        try {
            system.submitReview(5, "Absolutely loved the quality and features!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}