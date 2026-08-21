package scenariobasedprogramming;

import java.util.Scanner;

class Employee {
    int employeeId;
    String employeeName;
    double basicSalary;
    double bonus;

    // Zero-parameter constructor
    Employee() {
        this.employeeId = 0;
        this.employeeName = "";
        this.basicSalary = 0.0;
        this.bonus = 0.0;
    }

    // Parameterized constructor
    Employee(int employeeId, String employeeName, double basicSalary, double bonus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    // Method 1: Set Employee Details
    void setEmployeeDetails(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = 0.0;
    }

    // Method 2: Add Fixed Bonus
    void addBonus(double bonusAmount) {
        this.bonus = this.bonus + bonusAmount;
    }

    // Method 3: Add Percentage Bonus
    void addBonus(double bonusPercentage, double extraReward) {
        double percentageBonus = this.basicSalary * bonusPercentage / 100;
        double additionalBonus = percentageBonus + extraReward;
        this.bonus = this.bonus + additionalBonus;
    }

    // Method 4: Calculate Total Salary
    double calculateTotalSalary() {
        double totalSalary = this.basicSalary + this.bonus;
        return totalSalary;
    }

    // Method 5: Display Employee
    void displayEmployee() {
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Employee Name: " + this.employeeName);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

public class EmployeePayrollMgmt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read Employee 1 details
        int employeeId1 = scanner.nextInt();
        scanner.nextLine();
        String employeeName1 = scanner.nextLine();
        double basicSalary1 = scanner.nextDouble();
        double fixedBonus = scanner.nextDouble();

        // Object 1: Zero-parameter constructor + setEmployeeDetails + addBonus
        Employee employee1 = new Employee();
        employee1.setEmployeeDetails(employeeId1, employeeName1, basicSalary1);
        employee1.addBonus(fixedBonus);

        // Read Employee 2 details
        int employeeId2 = scanner.nextInt();
        scanner.nextLine();
        String employeeName2 = scanner.nextLine();
        double basicSalary2 = scanner.nextDouble();
        double initialBonus = scanner.nextDouble();
        double bonusPercentage = scanner.nextDouble();
        double extraReward = scanner.nextDouble();

        // Object 2: Parameterized constructor + overloaded addBonus
        Employee employee2 = new Employee(employeeId2, employeeName2, basicSalary2, initialBonus);
        employee2.addBonus(bonusPercentage, extraReward);

        // Display results
        System.out.println("Employee 1");
        employee1.displayEmployee();

        System.out.println();

        System.out.println("Employee 2");
        employee2.displayEmployee();

        scanner.close();
    }
}
