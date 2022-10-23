package conditionalStatementsAdvanced;

import java.util.Locale;
import java.util.Scanner;

public class HotelRoom07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        int nights = Integer.parseInt(sc.nextLine());
        double studio = nights;
        double apartment = nights;
        switch (month){
            case "May":
            case "October":
                studio *= 50.0;
                apartment *= 65.0;
                if (nights > 14) studio *= 0.7;
                else if (nights > 7) studio *= 0.95;
                break;
            case "June":
            case "September":
                studio *= 75.2;
                apartment *= 68.7;
                if (nights > 14) studio *= 0.8;
                break;
            case "July":
            case "August":
                studio *= 76.0;
                apartment *= 77.0;
                break;
        }
        if (nights > 14) apartment *= 0.9;
        System.out.printf(Locale.US,"Apartment: %.2f lv.%nStudio: %.2f lv.", apartment, studio);
    }
}
