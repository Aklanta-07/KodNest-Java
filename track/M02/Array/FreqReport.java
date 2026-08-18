package Array;

import java.util.Scanner;

public class FreqReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int res = freq(arr, target);
        System.out.println("Frequency of " + target + ": " + res);

        sc.close();
    }

    public static int freq(int[] arr, int target) {
        int count = 0;
        for (int ele : arr) {
            if (ele == target) {
                count++;
            }
        }
        return count;
    }
}
