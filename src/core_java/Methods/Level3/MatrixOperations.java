package core_java.Methods.Level3;
import java.util.Scanner;

public class MatrixOperations {
    public double[][] generateMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }
    public void displayMatrix(double[][] matrix, String name) {
        System.out.println(name + ":");
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
    public double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }
    public double determinant3x3(double[][] m) {
        return (m[0][0] * ((m[1][1] * m[2][2]) - (m[1][2] * m[2][1]))) -
                (m[0][1] * ((m[1][0] * m[2][2]) - (m[1][2] * m[2][0]))) +
                (m[0][2] * ((m[1][0] * m[2][1]) - (m[1][1] * m[2][0])));
    }
    public double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;
        return inv;
    }
    public double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;
        double[][] inv = new double[3][3];
        inv[0][0]= ((m[1][1] * m[2][2]) - (m[1][2] * m[2][1]))/ det;
        inv[0][1]= ((m[0][2] * m[2][1]) -(m[0][1] * m[2][2])) / det;
        inv[0][2]= ((m[0][1] * m[1][2])- (m[0][2] * m[1][1])) / det;
        inv[1][0]= ((m[1][2] * m[2][0])- (m[1][0] * m[2][2]))/ det;
        inv[1][1]= ((m[0][0]* m[2][2]) - (m[0][2] * m[2][0]))/ det;
        inv[1][2]= ((m[0][2] * m[1][0]) - (m[0][0] * m[1][2])) / det;
        inv[2][0]= ((m[1][0] * m[2][1])- (m[1][1] * m[2][0])) / det;
        inv[2][1]= ((m[0][1] * m[2][0]) - (m[0][0] * m[2][1]))/ det;
        inv[2][2]= ((m[0][0] * m[1][1]) - (m[0][1] * m[1][0])) / det;
        return inv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MatrixOperations obj = new MatrixOperations();
        System.out.print("Enter matrix size (2 for 2x2, 3 for 3x3): ");
        int n = sc.nextInt();
        double[][] matrix = obj.generateMatrix(n, n);
        obj.displayMatrix(matrix, "Original Matrix");
        double[][] transpose = obj.transpose(matrix);
        obj.displayMatrix(transpose, "Transpose");
        double determinant = (n == 2) ? obj.determinant2x2(matrix)
                : obj.determinant3x3(matrix);
        System.out.println("Determinant: " + determinant + "\n");
        double[][] inverse = (n == 2) ? obj.inverse2x2(matrix)
                : obj.inverse3x3(matrix);
        if (inverse != null) {
            obj.displayMatrix(inverse, "Inverse");
        } else {
            System.out.println("Inverse does not exist (Determinant = 0)\n");
        }
        sc.close();
    }
}
