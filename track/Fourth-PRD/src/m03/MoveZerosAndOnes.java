package m03;

import java.util.Scanner;

public class MoveZerosAndOnes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        if (!scn.hasNextInt()) return;
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        separate(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : " "));
        }
        System.out.println();
    }

    private static void separate(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] > arr[right]) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            }
        }
    }
}
