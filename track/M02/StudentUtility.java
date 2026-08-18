

import java.util.Scanner;

class StudentUtility {
    void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    double getPassingPercentage() {
        return 60.0;
    }

    double calculatePercentage(int javaScore, int sqlScore) {
        return (javaScore + sqlScore) / 2.0;
    }
}

class MainEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentUtility utility = new StudentUtility();

        int id = scanner.nextInt();
        scanner.nextLine(); // Consume remaining newline
        String name = scanner.nextLine();
        int javaScore = scanner.nextInt();
        int sqlScore = scanner.nextInt();

        utility.showReportTitle();
        utility.displayStudent(id, name);

        double percentage = utility.calculatePercentage(javaScore, sqlScore);
        double passingPercentage = utility.getPassingPercentage();

        System.out.println("Percentage: " + percentage);

        if (percentage >= passingPercentage) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: NEEDS IMPROVEMENT");
        }

        scanner.close();
    }
}
