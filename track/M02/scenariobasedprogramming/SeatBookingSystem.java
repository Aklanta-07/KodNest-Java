package scenariobasedprogramming;

import java.util.Scanner;

class TheatreBooking {
    int[] seats;
    int bookedCount;

    // Constructor
    TheatreBooking(int totalSeats) {
        this.seats = new int[totalSeats];
        this.bookedCount = 0;
    }

    // Method 1: Book Seat
    public String bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.length) {
            return "Invalid Seat";
        }

        int index = seatNumber - 1;
        if (seats[index] == 1) {
            return "Already Booked";
        }

        seats[index] = 1;
        bookedCount++;
        return "Booked";
    }

    // Method 2: Get Available Count
    public int getAvailableCount() {
        int availableCount = seats.length - bookedCount;
        return availableCount;
    }

    // Method 3: Display Seat Status
    public void displaySeatStatus() {
        System.out.println("Seat Status");
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                System.out.println("Seat " + (i + 1) + ": Booked");
            } else {
                System.out.println("Seat " + (i + 1) + ": Available");
            }
        }
    }
}

public class SeatBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSeats = sc.nextInt();
        int totalRequests = sc.nextInt();

        TheatreBooking bookingSystem = new TheatreBooking(totalSeats);

        for (int i = 1; i <= totalRequests; i++) {
            int seatNumber = sc.nextInt();
            String result = bookingSystem.bookSeat(seatNumber);
            System.out.println("Request " + i + " - Seat " + seatNumber + ": " + result);
        }

        bookingSystem.displaySeatStatus();
        System.out.println("Booked Seats: " + bookingSystem.bookedCount);
        System.out.println("Available Seats: " + bookingSystem.getAvailableCount());

        sc.close();
    }
}
