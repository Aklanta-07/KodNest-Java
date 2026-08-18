import java.util.Scanner;

class ResultCalculator {
    int getTotal(int first, int second) {
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        return first + second + third;
    }
}

class MainZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt(), second = scanner.nextInt(), third = scanner.nextInt();

        ResultCalculator calc = new ResultCalculator();
        int twoMarkTotal = calc.getTotal(first, second);
        int threeMarkTotal = calc.getTotal(first, second, third);

        System.out.println("Two-Mark Total: " + twoMarkTotal);
        System.out.println("Three-Mark Total: " + threeMarkTotal);
    }
}