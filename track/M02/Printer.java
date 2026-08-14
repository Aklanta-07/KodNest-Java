import java.util.Scanner;

public class Printer {
    void show(int number) {
        System.out.println("Number: " + number);
    }

    void show(String word) {
        System.out.println("Word: " + word);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        String word = scanner.next();

        Printer printer = new Printer();
        printer.show(number);
        printer.show(word);
    }
}