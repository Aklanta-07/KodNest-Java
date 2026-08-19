package matrix;

import java.util.Scanner;

public class ArrayCheckpoint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int size = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }

        int arrayTotal = 0;
        for (int ele : arr) {
            arrayTotal += ele;
        }

        int rows = scn.nextInt();
        int col = scn.nextInt();
        int[][] matrix = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        int matrixTotal = 0;
        for (int[] arrays : matrix) {
            for (int ele : arrays) {
                matrixTotal += ele;
            }
        }

        System.out.println("Array total: " + arrayTotal);
        System.out.println("Matrix total: " + matrixTotal);

        scn.close();
    }
}
