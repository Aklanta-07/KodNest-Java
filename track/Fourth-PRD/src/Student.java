public class Student {
    // Instance variables
    String name;
    String courseName;
    int completedTopics;
    int questionsSolved;

    // Method to set student details
    public void setDetails(String name, String courseName) {
        this.name = name;
        this.courseName = courseName;
    }

    // Method to set initial progress
    public void setProgress(int completedTopics, int questionsSolved) {
        this.completedTopics = completedTopics;
        this.questionsSolved = questionsSolved;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Course Name  : " + courseName);
    }

    // Method to display progress
    public void displayProgress() {
        System.out.println("Completed Topics : " + completedTopics);
        System.out.println("Questions Solved : " + questionsSolved);
    }

    // Method to add completed topics
    public void addTopics(int newTopics) {
        System.out.println("Current Completed Topics : " + completedTopics);
        System.out.println("New Topics Completed : " + newTopics);
        completedTopics = completedTopics + newTopics;
        System.out.println("After updating: Total Completed Topics : " + completedTopics);
    }

    // Method to add solved questions
    public void addQuestions(int newQuestions) {
        System.out.println("Current Questions Solved : " + questionsSolved);
        System.out.println("New Questions Solved : " + newQuestions);
        questionsSolved = questionsSolved + newQuestions;
        System.out.println("After updating: Total Questions Solved : " + questionsSolved);
    }
}