package nestedLoops;

import java.util.Scanner;

public class Travelling05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("End")) {
            String destination = input;
            double minBudget = Double.parseDouble(sc.nextLine());
            double balance = .0;
            while (minBudget > balance){
                double amount = Double.parseDouble(sc.nextLine());
                balance += amount;
           }
            System.out.printf("Going to %s!%n", destination);
            input = sc.nextLine();
       }
    }
}