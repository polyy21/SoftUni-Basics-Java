package nestedLoops;

import java.util.Locale;
import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int countTotalTickets = 0;
        int countStudent = 0;
        int countStandard = 0;
        int countKid = 0;
        while (!command.equals("Finish")) {
            String movie = command;
            int seat = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int countCurrentTickets = 0;
            while (!ticketType.equals("End")) {
                countCurrentTickets++;
                countTotalTickets++;
                if (ticketType.equals("standard")) countStandard++;
                else if (ticketType.equals("student")) countStudent++;
                else if (ticketType.equals("kid")) countKid++;
                if (countCurrentTickets >= seat) break;
                ticketType = scanner.nextLine();
            }
            System.out.printf(Locale.US, "%s - %.2f%% full.%n", movie, countCurrentTickets * 1.0 / seat *100);
            command = scanner.nextLine();
        }
        System.out.printf(Locale.US, "Total tickets: %d%n%.2f%% student tickets.%n%.2f%% standard tickets.%n%.2f%% kids tickets.%n", countTotalTickets, countStudent*1.0/countTotalTickets*100, countStandard*1.0/countTotalTickets*100, countKid*1.0/countTotalTickets*100);
    }
}
