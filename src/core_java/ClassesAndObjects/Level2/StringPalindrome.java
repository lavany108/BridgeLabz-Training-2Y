package core_java.ClassesAndObjects.Level2;

public class StringPalindrome {
    String text;
    StringPalindrome(String text) {
        this.text = text;
    }
    public boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }
    }
    public static void main(String[] args) {
        StringPalindrome p1 = new StringPalindrome("madam");
        p1.displayResult();
        StringPalindrome p2 = new StringPalindrome("hello");
        p2.displayResult();
    }
}
