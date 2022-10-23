package conditionalStatementsAdvanced;

import java.util.Locale;
import java.util.Scanner;

public class TradeCommissions12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        double s = Double.parseDouble(sc.nextLine());
        double result = -1;
        switch (city){
            case "Sofia":
                if (s>=0 && s<=500) result = s * 0.05;
                else if (s>500 && s<=1000) result = s * 0.07;
                else if (s>1000 && s<=10000) result = s * 0.08;
                else if (s>10000) result = s * 0.12;
                break;
            case "Varna":
                if (s>=0 && s<=500) result = s * 0.045;
                else if (s>500 && s<=1000) result = s * 0.075;
                else if (s>1000 && s<=10000) result = s * 0.10;
                else if (s>10000) result = s * 0.13;
                break;
            case "Plovdiv":
                if (s>=0 && s<=500) result = s * 0.055;
                else if (s>500 && s<=1000) result = s * 0.08;
                else if (s>1000 && s<=10000) result = s * 0.12;
                else if (s>10000) result = s * 0.145;
                break;
        }
        if (result < 0) System.out.println("error");
        else System.out.printf(Locale.US, "%.2f", result);
    }
}
