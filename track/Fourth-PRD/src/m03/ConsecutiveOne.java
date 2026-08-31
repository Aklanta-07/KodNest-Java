package m03;

import java.util.Scanner;

public class ConsecutiveOne {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int maxStreak = 0;
        int currentStreak = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                currentStreak++;
                maxStreak = Math.max(maxStreak, currentStreak);
            } else {
                currentStreak = 0;
            }
        }

        System.out.println(maxStreak);
        scn.close();
    }
}
