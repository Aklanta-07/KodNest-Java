import java.util.Scanner;

class MethodDemo {
    void sayHello() {
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        return 7;
    }

    int add(int first, int second) {
        return first + second;
    }
}

class MainTwelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        MethodDemo demo = new MethodDemo();

        demo.sayHello();
        demo.greet(name);

        int luckyNumber = demo.getLuckyNumber();
        int sum = demo.add(first, second);

        System.out.println("Lucky Number: " + luckyNumber);
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}