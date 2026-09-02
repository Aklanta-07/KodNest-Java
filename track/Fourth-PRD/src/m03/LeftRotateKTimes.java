package m03;

import java.util.Scanner;

public class LeftRotateKTimes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        if (!scn.hasNextInt()) return;
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        rotate(arr, k);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();
    }

    private static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        if (k == 0) return;

        // 1. Reverse the first part: [0, k - 1]
        reverse(arr, 0, k - 1);

        // 2. Reverse the remaining part: [k, n - 1]
        reverse(arr, k, n - 1);

        // 3. Reverse the entire array: [0, n - 1]
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
