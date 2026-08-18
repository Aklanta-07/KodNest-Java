package Array;

import java.util.Scanner;

public class SearchandReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        String res = search(arr, target);
        System.out.println(res);

        reverse(arr);

        sc.close();
    }

    public static String search(int[] arr, int target) {
        for (int ele : arr) {
            if (ele == target) {
                return "Found";
            }
        }
        return "Not Found";
    }

    public static void reverse(int[] arr) {
        System.out.print("Reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
