import java.util.Scanner;
public class NextLineMethod {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print(name);

        scanner.nextLine();

        System.out.println("Enter a Sentence");
        String line = scanner.nextLine();

        System.out.println("You entered line : "+line);

        System.out.println("Enter a text");
        String text = scanner.nextLine();

        System.out.println("You entered text : "+text);

        scanner.close();
    }
}
