import java.util.Scanner;

public class Learner {
    int id;
    String name;
    int javaScore;
}

 class MainLearner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Learner l1 = createLearner(scanner);
        Learner l2 = createLearner(scanner);

        int newScore = scanner.nextInt();

        System.out.println("Before Update");
        print(l1);
        print(l2);

        l1.javaScore = newScore;

        System.out.println("After Update");
        print(l1);
        print(l2);
    }

    private static Learner createLearner(Scanner scanner) {
        Learner learner = new Learner();
        learner.id = scanner.nextInt();
        learner.name = scanner.next();
        learner.javaScore = scanner.nextInt();
        return learner;
    }

    private static void print(Learner learner) {
        System.out.println(learner.id + " - " + learner.name + " - " + learner.javaScore);
    }
}