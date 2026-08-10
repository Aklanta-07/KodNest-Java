import java.util.Scanner;

public class Student {
    int id;
    String name;
    String course;
    double javaScore;
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create one Student object
        Student student = new Student();
        
        // Read and store all values in the object
        student.id = scanner.nextInt();
        student.name = scanner.next();
        student.course = scanner.next();
        student.javaScore = scanner.nextDouble();
        
        // Display the values stored in the object
        System.out.println("Student Profile");
        System.out.println("ID: " + student.id);
        System.out.println("Name: " + student.name);
        System.out.println("Course: " + student.course);
        System.out.println("Java Score: " + student.javaScore);
    }
}