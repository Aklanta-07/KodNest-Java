package m03;

import java.util.Scanner;

public class FindMissingElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        if (!scn.hasNextInt()) return;

        long n = scn.nextLong();
        long actualSum = 0;

        for (int i = 0; i < n - 1; i++) {
            actualSum += scn.nextLong();
        }

        long expectedSum = n * (n + 1) / 2;
        System.out.println(expectedSum - actualSum);
    }
}
