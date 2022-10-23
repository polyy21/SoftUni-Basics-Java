package firstSteps;

import java.util.Locale;
import java.util.Scanner;

public class BasketballEq08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = Integer.parseInt(sc.nextLine());
        sc.close();
        double sneakers = 6.0/10 * price;
        double jersey = 8.0/10 * sneakers;
        double ball = 1.0/4 * jersey;
        double accessories = 1.0/5 * ball;
        double sum = price + sneakers + jersey + ball + accessories;
        System.out.printf(Locale.US, "%.2f", sum);
    }
}
