package constructor;

import java.util.Scanner;

class CabBooking {
    String passengerName;
    String cabType;
    int distance;
    int fare;

    CabBooking(String passengerName) {
        this.passengerName = passengerName;
        this.cabType = "Mini";
        this.distance = 5;
        this.fare = 75;
    }

    CabBooking(String passengerName, String cabType, int distance) {
        this.passengerName = passengerName;
        this.cabType = cabType;
        this.distance = distance;
        this.fare = distance * 15;
    }

    void displayBooking() {
        System.out.println("Passenger: " + passengerName);
        System.out.println("Cab Type: " + cabType);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: Rs. " + fare);
    }
}

public class CabMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        String passengerName = scanner.next();

        CabBooking booking;

        if (choice == 1) {
            booking = new CabBooking(passengerName);
        } else {
            String cabType = scanner.next();
            int distance = scanner.nextInt();
            booking = new CabBooking(passengerName, cabType, distance);
        }

        booking.displayBooking();
    }
}
