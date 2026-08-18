package matrix;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(arr.length);
        System.out.println(grid[0].length);

        for (int[] ints : grid) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
