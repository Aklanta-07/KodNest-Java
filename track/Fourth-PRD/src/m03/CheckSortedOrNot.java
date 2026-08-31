package m03;

import java.util.Scanner;

public class CheckSortedOrNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                res = 0;
                System.out.println(res);
                return;
            }
        }

        System.out.println(res);
        scn.close();
    }
}
