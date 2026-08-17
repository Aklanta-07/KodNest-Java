package Array;

import java.util.Scanner;

public class AnalyzeRuntimeData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] readings = new int[5];

        for (int index = 0; index < readings.length; index++) {
            readings[index] = scanner.nextInt();
        }

        int total = 0;
        for (int index = 0; index < readings.length; index++) {
            total = total + readings[index];
        }

        System.out.println("Total: " + total);
        scanner.close();
    }
    
}
