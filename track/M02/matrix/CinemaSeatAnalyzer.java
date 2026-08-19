package matrix;

import java.util.Scanner;

public class CinemaSeatAnalyzer {
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

        int available = 0;
        for (int[] ints : arr) {
            for (int ele : ints) {
                if (ele == 0) {
                    available++;
                }
            }
        }

        System.out.println("Available seats: " + available);
        scn.close();
    }
}
