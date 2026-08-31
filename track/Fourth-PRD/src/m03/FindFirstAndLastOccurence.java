package m03;

import java.util.Scanner;

public class FindFirstAndLastOccurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        int firstIdx = -1;
        int lastIdx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                firstIdx = i;
                break;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                lastIdx = i;
                break;
            }
        }

        System.out.println(firstIdx + " " + lastIdx);
        scanner.close();
    }
}
