package conditionalStatementsAdvanced;

import java.util.Locale;
import java.util.Scanner;

public class SkiTrip09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        String type = sc.nextLine();
        String mark = sc.nextLine();
        double price = days-1;
        switch (type){
            case "room for one person":
                price *= 18.0;
                break;
            case "apartment":
                price *= 25.0;
                if (days < 10) price *= 0.7;
                else if (days <= 15) price *= 0.65;
                else if (days > 15) price *= 0.5;
                break;
            case "president apartment":
                price *= 35.0;
                if (days < 10) price *= 0.9;
                else if (days <= 15) price *= 0.85;
                else if (days > 15) price *= 0.8;
                break;
            default:
                System.out.println("You got a typo!");
                System.exit(1);
                break;
        }
        if (mark.equals("positive")) price *= 1.25;
        else price *= 0.9;
        System.out.printf(Locale.US, "%.2f", price);
    }
}