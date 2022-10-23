package nestedLoops;

import java.util.Locale;
import java.util.Scanner;

public class CinemaTickets06 {
    public static void main(String[] args) {
        //!!!
        // tova, koeto judge ne priznava

        Scanner scanner = new Scanner(System.in);
        int student = 0;
        int standard = 0;
        int kid = 0;
        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            String title = input;
            int tickets = 0;

            int places = Integer.parseInt(scanner.nextLine());
            input = scanner.nextLine();
            while (!input.equals("End")) {
                String type = input;
                input = scanner.nextLine();
                tickets++;
                if (type.equals("standard")) standard++;
                else if (type.equals("kid")) kid++;
                else if (type.equals("student")) student++;
                if (tickets >= places) break;
            }
            double full = (tickets * 1.0 / places) * 100;
            System.out.printf(Locale.US, "%s - %.2f%% full.%n", title, full);
            //if (input.equals("Finish")) break;
            input = scanner.nextLine();
        }
        int total = standard + student + kid;
        double prStudent = (student * 1.0 / total) * 100;
        double prStandard = (standard * 1.0 / total) * 100;
        double prKids = (kid * 1.0 / total) * 100;
        System.out.printf(Locale.US, "Total tickets: %d%n%.2f%% student tickets.%n%.2f%% standard tickets.%n%.2f%% kids tickets.%n", total, prStudent, prStandard, prKids);
    }
}