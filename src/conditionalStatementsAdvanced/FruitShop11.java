package conditionalStatementsAdvanced;

import java.util.Locale;
import java.util.Scanner;

public class FruitShop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();
        String day = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());
        double price = 0;
        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit){
                    case "banana":
                        price = 2.5;
                        System.out.printf(Locale.US,"%.2f", quantity*price);
                        break;
                    case "apple":
                        price = 1.2;
                        System.out.printf(Locale.US,"%.2f", quantity*price);
                        break;
                    case "orange":
                        price = 0.85;
                        System.out.printf(Locale.US,"%.2f", quantity*price);
                        break;
                    case "grapefruit":
                        price = 1.45;
                        System.out.printf(Locale.US,"%.2f", quantity*price);
                        break;
                    case "kiwi":
                        price = 2.7;
                        System.out.printf(Locale.US,"%.2f", quantity*price);
                        break;
                    case "pineapple":
                        price = 5.5;
                        System.out.printf(Locale.US,"%.2f", quantity*price);
                        break;
                    case "grapes":
                        price = 3.85;
                        System.out.printf(Locale.US,"%.2f", quantity*price);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (fruit){
                    case "banana":
                        price = 2.7;
                        System.out.printf(Locale.US,"%.2f", quantity*price);
                        break;
                    case "apple":
                        price = 1.25;
                        System.out.printf(Locale.US,"%.2f", quantity*price);
                        break;
                    case "orange":
                        price = 0.9;
                        System.out.printf(Locale.US,"%.2f", quantity*price);
                        break;
                    case "grapefruit":
                        price = 1.6;
                        System.out.printf(Locale.US,"%.2f", quantity*price);
                        break;
                    case "kiwi":
                        price = 3;
                        System.out.printf(Locale.US,"%.2f", quantity*price);
                        break;
                    case "pineapple":
                        price = 5.6;
                        System.out.printf(Locale.US,"%.2f", quantity*price);
                        break;
                    case "grapes":
                        price = 4.2;
                        System.out.printf(Locale.US,"%.2f", quantity*price);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
