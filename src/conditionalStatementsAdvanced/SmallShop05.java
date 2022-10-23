package conditionalStatementsAdvanced;

import java.util.Scanner;

public class SmallShop05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        String city = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());
        if (city.equals("Sofia")){
            switch (product){
                case "coffee":
                    System.out.println(0.5*quantity);
                    break;
                case "water":
                    System.out.println(0.8*quantity);
                    break;
                case "beer":
                    System.out.println(1.2*quantity);
                    break;
                case "sweets":
                    System.out.println(1.45*quantity);
                    break;
                case "peanuts":
                    System.out.println(1.6*quantity);
                    break;
            }
        } else if (city.equals("Plovdiv")){
            switch (product){
                case "coffee":
                    System.out.println(0.4*quantity);
                    break;
                case "water":
                    System.out.println(0.7*quantity);
                    break;
                case "beer":
                    System.out.println(1.15*quantity);
                    break;
                case "sweets":
                    System.out.println(1.3*quantity);
                    break;
                case "peanuts":
                    System.out.println(1.5*quantity);
                    break;
            }
        } else if (city.equals("Varna")){
            switch (product){
                case "coffee":
                    System.out.println(0.45*quantity);
                    break;
                case "water":
                    System.out.println(0.7*quantity);
                    break;
                case "beer":
                    System.out.println(1.1*quantity);
                    break;
                case "sweets":
                    System.out.println(1.35*quantity);
                    break;
                case "peanuts":
                    System.out.println(1.55*quantity);
                    break;
            }
        }
    }
}
