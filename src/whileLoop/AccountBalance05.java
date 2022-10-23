package whileLoop;

import java.util.Locale;
import java.util.Scanner;

public class AccountBalance05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0.0;
        String input = sc.nextLine();
        while (!input.equals("NoMoreMoney")){
            double m = Double.parseDouble(input);
            if (m < 0){
                System.out.println("Invalid operation!");
                break;
            }
            balance += m;
            System.out.printf(Locale.US, "Increase: %.2f%n", m);
            input = sc.nextLine();
        }
        System.out.printf(Locale.US,"Total: %.2f", balance);
    }
}
