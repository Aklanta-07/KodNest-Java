package m03;

import java.util.Scanner;

public class ReverseSelectedRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        if (!scn.hasNextInt()) return;
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int left = scn.nextInt();
        int right = scn.nextInt();

        reverseRange(arr, left, right);
    }

    public static void reverseRange(int[] arr, int left, int right) {
        if (left < 0 || left > right || right >= arr.length) {
            System.out.println("-1");
            return;
        }

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : " "));
        }
        System.out.println();
    }
}
