package m03;

import java.util.Scanner;

public class ClosestToTarget {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        long target = scn.nextLong();

        int closestValue = arr[0];
        long minDiff = Math.abs((long) arr[0] - target);

        for (int i = 1; i < n; i++) {
            long currentDiff = Math.abs((long) arr[i] - target);

            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                closestValue = arr[i];
            } else if (currentDiff == minDiff) {
                if (arr[i] < closestValue) {
                    closestValue = arr[i];
                }
            }
        }

        System.out.println(closestValue);
        scn.close();
    }
}
