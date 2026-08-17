package Array;

public class DebugAndTraceUsingArray {
    public static void main(String[] args) {
        int[] original = {14, 18, 22, 26};
        int updateIndex = 1;
        int updatedValue = 25;
        int requestedIndex = 4;

        int[] snapshot = new int[original.length];
        for (int index = 0; index < original.length; index++) {
            snapshot[index] = original[index];
        }

        int[] liveView = original;
        if (updateIndex >= 0 && updateIndex < liveView.length) {
            liveView[updateIndex] = updatedValue;
        }

        System.out.print("Original: ");
        for (int value : original) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Snapshot: ");
        for (int value : snapshot) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Same object: " + (original == liveView));

        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println("Requested value: " + original[requestedIndex]);
        } else {
            System.out.println("Requested value: Invalid index");
        }
    }
}
