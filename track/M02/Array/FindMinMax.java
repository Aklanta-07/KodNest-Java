package Array;

import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int ele : arr) {
            if (ele > max) {
                max = ele;
            } else if (ele < min) {
                min = ele;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        scanner.close();
    }
}
