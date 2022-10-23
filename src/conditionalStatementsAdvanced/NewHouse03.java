package conditionalStatementsAdvanced;

import java.util.Locale;
import java.util.Scanner;

public class NewHouse03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        int number = Integer.parseInt(sc.nextLine());
        int budget = Integer.parseInt(sc.nextLine());
        double discount = 0.0;
        double sum = number;
        if (type.equals("Roses")) {
            sum *= 5.0;
            if (number > 80) discount = 0.1;
        } else if (type.equals("Dahlias")) {
            sum *= 3.8;
            if (number > 90) discount = 0.15;
        } else if (type.equals("Tulips")) {
            sum *= 2.8;
            if (number > 80) discount = 0.15;
        } else if (type.equals("Narcissus")) {
            sum *= 3.0;
            if (number < 120) discount = -0.15;
        } else if (type.equals("Gladiolus")) {
            sum *= 2.5;
            if (number < 80) discount = -0.2;
        }
        sum *= (1 - discount);
        if (budget - sum >= 0) {
            System.out.printf(Locale.US, "Hey, you have a great garden with %d %s and %.2f leva left.", number, type, (budget - sum));
        } else System.out.printf(Locale.US, "Not enough money, you need %.2f leva more.", (sum - budget));
    }
}
