package m03;

import java.util.Scanner;

public class FirstNonRepeatingValue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        firstNonRepeating(arr);

        scn.close();
    }

    public static void firstNonRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(arr[i]);
                return;
            }
        }

        System.out.println(-1);
    }
}
