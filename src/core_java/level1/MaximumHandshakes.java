package core_java.level1;
import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int handshakes = (n * (n - 1)) / 2;

        System.out.println("Maximum number of possible handshakes = " + handshakes);
    }
}
