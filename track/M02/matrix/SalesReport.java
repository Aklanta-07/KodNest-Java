package matrix;

import java.util.Scanner;

public class SalesReport {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int col = scn.nextInt();
        int[][] arr = new int[rows][col];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int total = 0;
            for (int val : arr[i]) {
                total += val;
            }
            System.out.println("Product " + (i + 1) + " total: " + total);
        }

        scn.close();
    }
}
