package m03;

import java.util.Scanner;

public class FindPairForTargetSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        if (!scn.hasNextInt()) return;
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        findPair(arr, target);
    }

    private static void findPair(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(arr[left] + " " + arr[right]);
                return;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        System.out.println(-1);
    }
}
