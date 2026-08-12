import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Create one Student object
        Student student = new Student();

        // Accept Student Details
        System.out.println("Enter Student Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Course Name:");
        String courseName = scanner.nextLine();

        System.out.println("Enter Completed Topics:");
        int completedTopics = scanner.nextInt();

        System.out.println("Enter Questions Solved:");
        int questionsSolved = scanner.nextInt();

        // Call the appropriate methods to store the values
        student.setDetails(name, courseName);
        student.setProgress(completedTopics, questionsSolved);

        // Display initial menu
        displayMenu();

        int choice;
        boolean running = true;

        // Use a while loop so that the menu appears again after each operation
        while (running) {
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // View Student Details
                    student.displayDetails();
                    break;

                case 2:
                    // View Progress
                    student.displayProgress();
                    break;

                case 3:
                    // Add Completed Topics
                    System.out.println("Enter New Completed Topics:");
                    int newTopics = scanner.nextInt();
                    student.addTopics(newTopics);
                    System.out.println("Topics updated successfully.");
                    System.out.println("Total Completed Topics : " + student.completedTopics);
                    break;

                case 4:
                    // Add Solved Questions
                    System.out.println("Enter New Questions Solved:");
                    int newQuestions = scanner.nextInt();
                    student.addQuestions(newQuestions);
                    System.out.println("Questions updated successfully.");
                    System.out.println("Total Questions Solved : " + student.questionsSolved);
                    break;

                case 5:
                    // Exit
                    System.out.println("Thank you for using Student Practice Tracker.");
                    System.out.println("Keep Practicing!");
                    running = false;
                    break;

                default:
                    // Handle Invalid Menu Choice
                    System.out.println("Invalid choice.");
                    System.out.println("Please enter a value between 1 and 5.");
                    break;
            }

            if (running) {
                displayMenu();
            }
        }

        scanner.close();
    }

    // Helper method to display the menu
    public static void displayMenu() {
        System.out.println("\n============================");
        System.out.println("   STUDENT PRACTICE TRACKER");
        System.out.println("============================");
        System.out.println();
        System.out.println("1. View Student Details");
        System.out.println("2. View Progress");
        System.out.println("3. Add Completed Topics");
        System.out.println("4. Add Solved Questions");
        System.out.println("5. Exit");
    }
}