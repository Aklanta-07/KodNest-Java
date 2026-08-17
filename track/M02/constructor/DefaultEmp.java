package constructor;

import java.util.Scanner;

class Employee {
    String name;
    String role;

    Employee() {
        role = "Trainee";
    }

    void displayProfile() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Role: " + role);
    }
}

public class DefaultEmp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String employeeName = scanner.next();

        Employee employee = new Employee();
        employee.name = employeeName;
        employee.displayProfile();

        scanner.close();
    }
}
