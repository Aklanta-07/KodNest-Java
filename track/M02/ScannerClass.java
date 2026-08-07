import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("You are " + name + " and you are " + age + " years old.");

        System.out.println("Enter a short value");
        short s = scanner.nextShort();
        System.out.println("Short value: " + s);

        System.out.println("Enter a byte value");
        byte b = scanner.nextByte();
        System.out.println("Byte value: " + b);

        System.out.println("Enter a long value");
        long l = scanner.nextLong();
        System.out.println("Long value: " + l);

        System.out.println("Enter a float value");
        float f = scanner.nextFloat();
        System.out.println("Float value: " + f);

        System.out.println("Enter a double value");
        double d = scanner.nextDouble();
        System.out.println("Double value: " + d);

        System.out.println("Enter a boolean value");
        boolean bln = scanner.nextBoolean();
        System.out.println("Boolean value: " + bln);

        scanner.close();
    }   
}
