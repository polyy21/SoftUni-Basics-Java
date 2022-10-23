package conditionalStatementsAdvanced;

import java.util.Locale;
import java.util.Scanner;

public class FishingBoat04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int fishermen = Integer.parseInt(sc.nextLine());
        double price = 0.0;
        switch (season){
            case "Spring":
                price = 3000.0;
                break;
            case "Summer":
            case "Autumn":
                price = 4200.0;
                break;
            case "Winter":
                price = 2600.0;
                break;
        }
        if (fishermen <= 6) price *= 0.9;
        else if (fishermen > 7 && fishermen <= 11) price *= 0.85;
        else if (fishermen >= 12) price *= 0.75;
        if (!season.equals("Autumn") && fishermen%2==0) price *= 0.95;

        if (budget - price >= 0) System.out.printf(Locale.US,"Yes! You have %.2f leva left.", (budget-price));
        else System.out.printf(Locale.US,"Not enough money! You need %.2f leva.", (price-budget));
    }
}
