package exam;

import java.util.Locale;
import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double sum = numberOfDancers * points;
        if (!place.equals("Bulgaria")) {
            sum *= 1.5; //Abroad
            if (season.equals("summer")) sum *= 0.9; // -10%
            else sum *= 0.85; // -15% winter
        } else {
            if (season.equals("summer")) sum *= 0.95; // -5%
            else sum *= 0.92; // -8% winter
        }

        double charity = 0.75 * sum;
        sum -= charity;
        double moneyPerDancer = sum / numberOfDancers;

        System.out.printf(Locale.US, "Charity - %.2f%nMoney per dancer - %.2f%n", charity, moneyPerDancer);
    }
}