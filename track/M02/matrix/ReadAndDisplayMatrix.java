package matrix;

import java.util.Scanner;

public class ReadAndDisplayMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int columns = scn.nextInt();

        int[][] arr = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for(int i = 0; i < rows; i++) {
            for(int ele : arr[i]) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
