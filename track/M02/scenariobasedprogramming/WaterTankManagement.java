package scenariobasedprogramming;

import java.util.Scanner;

class WaterTank {
    int capacity;
    int currentLevel;

    WaterTank(int capacity, int currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    public int fillWater(int amount) {
        if (amount <= 0) {
            return 0;
        }
        int availableSpace = capacity - currentLevel;
        int added = Math.min(amount, availableSpace);
        currentLevel += added;
        return added;
    }

    public int drainWater(int amount) {
        if (amount <= 0) {
            return 0;
        }
        int removed = Math.min(amount, currentLevel);
        currentLevel -= removed;
        return removed;
    }

    public String getStatus() {
        if (currentLevel == 0) {
            return "Empty";
        }
        if (currentLevel == capacity) {
            return "Full";
        }

        double fillPercentage = currentLevel * 100.0 / capacity;

        if (fillPercentage <= 25.0) {
            return "Low";
        } else if (fillPercentage <= 75.0) {
            return "Medium";
        } else {
            return "High";
        }
    }

    public void displayTank() {
        int availableSpace = capacity - currentLevel;
        System.out.println("Capacity: " + capacity);
        System.out.println("Current Level: " + currentLevel);
        System.out.println("Available Space: " + availableSpace);
        System.out.println("Status: " + getStatus());
    }
}

public class WaterTankManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int capacity = sc.nextInt();
        int currentLevel = sc.nextInt();
        int numOperations = sc.nextInt();

        WaterTank tank = new WaterTank(capacity, currentLevel);

        for (int i = 1; i <= numOperations; i++) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int fillAmt = sc.nextInt();
                    int actualFilled = tank.fillWater(fillAmt);
                    System.out.println("Operation " + i + " - Filled: " + actualFilled);
                    break;
                case 2:
                    int drainAmt = sc.nextInt();
                    int actualDrained = tank.drainWater(drainAmt);
                    System.out.println("Operation " + i + " - Drained: " + actualDrained);
                    break;
                case 3:
                    System.out.println("Operation " + i + " - Tank Status");
                    tank.displayTank();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }

        System.out.println("Final Tank Status");
        tank.displayTank();

        sc.close();
    }
}
