import java.util.Arrays;
import java.util.Scanner;
public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to matrix transpose calculator!");

        System.out.print("How many rows does matrix[A] has : ");
        int row = sc.nextInt();
        System.out.print("How many columns does matrix[A] has : ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        int[][] transpose = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Matrix[A](" + row + "x" + col + ") =");
        for (int k = 0; k < matrix.length; k++) {
            System.out.println("\t\t" + Arrays.toString(matrix[k]));
        }
        System.out.println("\nMatrix[A^T](" + col + "x" + row + ") =");
        for (int k = 0; k < transpose.length; k++) {
            System.out.println("\t\t" + Arrays.toString(transpose[k]));
        }

    }
}