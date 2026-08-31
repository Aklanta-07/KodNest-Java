package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int[][] ragged = new int[3][];
        ragged[0] = new int[2];
        ragged[1] = new int[3];
        ragged[2] = new int[4];

        for(int i = 0 ; i < ragged.length; i++) {
            for(int j = 0; j < ragged[i].length; j++) {
                ragged[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(ragged));
        System.out.println(Arrays.toString(ragged[0]));
        System.out.println(Arrays.toString(ragged[1]));
        System.out.println(Arrays.toString(ragged[2]));
    }
}
