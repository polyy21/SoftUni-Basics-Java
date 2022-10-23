package conditionalStatementsAdvanced;

import java.util.Locale;
import java.util.Scanner;

public class Journey05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        String type = "Hotel";
        String destination = "";
        double sum = 0.0;
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")){
                type = "Camp";
                sum = 0.3 * budget;
            } else if (season.equals("winter")) {
                sum = 0.7 * budget;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")){
                type = "Camp";
                sum = 0.4 * budget;
            } else if (season.equals("winter")) {
                sum = 0.8 * budget;
            }
        } else {
            destination = "Europe";
            sum = 0.9 * budget;
        }
        System.out.printf(Locale.US, "Somewhere in %s%n%s - %.2f", destination, type, sum);
    }
}
