package constructor;

import java.util.Scanner;

class MobilePlan {
    String planName;
    int price;

    MobilePlan() {
        this.planName = "Basic";
        this.price = 199;
    }

    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}

 class MainFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String planName = scanner.nextLine();
        int price = scanner.nextInt();

        MobilePlan defaultPlan = new MobilePlan();
        MobilePlan selectedPlan = new MobilePlan(planName, price);

        defaultPlan.display();
        selectedPlan.display();
    }
}