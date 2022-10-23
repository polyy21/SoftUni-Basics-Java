package conditionalStatementsAdvanced;

import java.util.Locale;
import java.util.Scanner;

public class Cinema01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        int r = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        double income  = r * c;
        switch (type){
            case "Premiere":
                income *= 12.0;
                break;
            case "Normal":
                income *= 7.5;
                break;
            case "Discount":
                income *= 5.0;
                break;
        }
        System.out.printf(Locale.US,"%.2f leva", income);
    }
}
