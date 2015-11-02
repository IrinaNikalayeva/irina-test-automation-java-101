package Matrix;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of rows: ");
            int m = scanner.nextInt();
            System.out.println("Enter number of columns: ");
            int n = scanner.nextInt();
            int[][] matrix = new int[m][n];
            int[][] tMatrix = new int[n][m];


            if (m == 0 || n == 0) {
                System.out.println("Wrong Matrix! ");
            } else {
                System.out.println("Fill in the matrix");

                for (int i = 0; i < m; i++) {  // filling in matrix
                    for (int j = 0; j < n; j++) {

                        matrix[i][j] = scanner.nextInt();
                    }
                }


            }


            System.out.println("Transposed matrix: ");

            for (int i = 0; i < n; i++) {  // transpose matrix
                for (int j = 0; j < m; j++) {

                    tMatrix[i][j] = matrix[j][i];

                    System.out.print(tMatrix[i][j] + " ");

                }

                System.out.println();


            }


        } catch (InputMismatchException e) {
            System.out.print("Please use integer numbers!");
        } catch (OutOfMemoryError e) {
            System.out.println("Matrix length is too big!");
        }
    }

}