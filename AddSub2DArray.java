package bhagirath;
import java.util.*;
public class AddSub2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of rows and Columns: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {                
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        int[][] C_add = new int[rows][cols];
        int[][] C_sub = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C_add[i][j] = A[i][j] + B[i][j];
                C_sub[i][j] = A[i][j] - B[i][j];
            }
        }
        
        System.out.println("Matrix A:");
        printMatrix(A);
        
        System.out.println("Matrix B:");
        printMatrix(B);
        
        System.out.println("Matrix A + Matrix B:");
        printMatrix(C_add);
        
        System.out.println("Matrix A - Matrix B:");
        printMatrix(C_sub);
        
        scanner.close();
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
	}

}
