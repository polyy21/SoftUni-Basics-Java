package exam;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumMeters = 5364;
        boolean reached = false;

        for (int i = 1; i <= 5; ) {
            String input = scanner.nextLine();
            int meters;
            if (input.equals("END")) break;
            if (input.equals("Yes")) i++;
            if (i>5) break;
            meters = Integer.parseInt(scanner.nextLine());
            sumMeters += meters;
            if (sumMeters >= 8848 && i<=5) {
                reached = true;
                System.out.printf("Goal reached for %d days!", i);
                break;
            }
        }
        if (!reached) System.out.printf("Failed!%n%d%n", sumMeters);
    }
}