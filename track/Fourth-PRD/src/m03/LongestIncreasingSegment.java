package m03;

import java.util.Scanner;

public class LongestIncreasingSegment {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        if (n == 0) {
            System.out.println(0);
            scn.close();
            return;
        }

        int maxLen = 1;
        int currLen = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                currLen++;
            } else {
                currLen = 1;
            }
            maxLen = Math.max(maxLen, currLen);
        }

        System.out.println(maxLen);
        scn.close();
    }
}