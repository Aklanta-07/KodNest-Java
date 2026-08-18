package constructor;

import java.util.Scanner;

class EmployeeOne {
    String name;
    String role;

    EmployeeOne() {
        role = "Trainee";
    }

    void displayProfile() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Role: " + role);
    }
}

public class EmployeProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String employeeName = scanner.next();

        EmployeeOne employee = new EmployeeOne();
        employee.name = employeeName;
        employee.displayProfile();

        scanner.close();
    }
}
