package constructor;

import java.util.Scanner;

class FoodOrder {
    String item;
    int quantity;

    FoodOrder(String item) {
        this.item = item;
        this.quantity = 1;
    }

    FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}

 class MainFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item = scanner.nextLine();
        int quantity = scanner.nextInt();

        FoodOrder singleOrder = new FoodOrder(item);
        FoodOrder groupOrder = new FoodOrder(item, quantity);

        singleOrder.display();
        groupOrder.display();
    }
}
