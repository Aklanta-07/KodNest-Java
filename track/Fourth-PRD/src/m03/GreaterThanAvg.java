package m03;

import java.util.Scanner;

public class GreaterThanAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / n;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
