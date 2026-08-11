import java.util.Scanner;

public class SupportTicket {
    int id;
    int priority;
    int waitingMinutes;
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SupportTicket ticket1 = createTicket(scanner);
        SupportTicket ticket2 = createTicket(scanner);
        SupportTicket ticket3 = createTicket(scanner);

        SupportTicket selected = ticket1;

        if (isBetter(ticket2, selected)) {
            selected = ticket2;
        }

        if (isBetter(ticket3, selected)) {
            selected = ticket3;
        }

        System.out.println("Selected Ticket: " + selected.id);
        System.out.println("Priority: " + selected.priority);
        System.out.println("Waiting Minutes: " + selected.waitingMinutes);
    }

    private static SupportTicket createTicket(Scanner scn) {
        SupportTicket ticket = new SupportTicket();
        ticket.id = scn.nextInt();
        ticket.priority = scn.nextInt();
        ticket.waitingMinutes = scn.nextInt();
        return ticket;
    }

    private static boolean isBetter(SupportTicket candidate, SupportTicket selected) {
        if (candidate.priority != selected.priority) {
            return candidate.priority > selected.priority;
        }
        if (candidate.waitingMinutes != selected.waitingMinutes) {
            return candidate.waitingMinutes > selected.waitingMinutes;
        }
        return candidate.id < selected.id;
    }
}