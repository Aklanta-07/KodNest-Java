package m03;

import java.util.Scanner;

public class SecondSmallestDistinctValue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        secondSmallest(arr);

        scn.close();
    }

    public static void secondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j < smallest) {
                secondSmallest = smallest;
                smallest = j;
            } else if (j > smallest && j < secondSmallest) {
                secondSmallest = j;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest distinct value");
        } else {
            System.out.println(secondSmallest);
        }
    }
}
