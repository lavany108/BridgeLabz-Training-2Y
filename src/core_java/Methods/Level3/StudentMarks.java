package core_java.Methods.Level3;
import java.util.Scanner;

public class StudentMarks {
        public int[][] generatePCMScores(int n) {
            int[][] scores = new int[n][3];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    scores[i][j] = (int) (Math.random() * 90) + 10;
                }
            }
            return scores;
        }
        public double[][] calculateResults(int[][] scores) {
            double[][] results = new double[scores.length][3];
            for (int i = 0; i < scores.length; i++) {
                int total = scores[i][0] + scores[i][1] + scores[i][2];
                double avg = Math.round((total / 3.0) * 100.0) / 100.0;
                double percent = Math.round(((total / 300.0) * 100) * 100.0) / 100.0;
                results[i][0] = total;
                results[i][1] = avg;
                results[i][2] = percent;
            }
            return results;
        }
        public void display(int[][] scores, double[][] results) {
            System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\n");
            for (int i = 0; i < scores.length; i++) {
                System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] +
                        "\t" + (int) results[i][0] + "\t" + results[i][1] + "\t" + results[i][2]);
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            StudentMarks obj = new StudentMarks();
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            int[][] scores = obj.generatePCMScores(n);
            double[][] results = obj.calculateResults(scores);
            obj.display(scores, results);
            sc.close();
        }
}
