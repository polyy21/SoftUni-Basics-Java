package firstSteps;

import java.util.Locale;
import java.util.Scanner;

public class FoodDelivery07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chick = Integer.parseInt(sc.nextLine());
        int fish = Integer.parseInt(sc.nextLine());
        int veg = Integer.parseInt(sc.nextLine());
        double sum = 12.0/10 * (chick*10.35 + fish*12.4 + veg*8.15) + 2.5;
        System.out.printf(Locale.US,"%.2f%n", sum);
    }
}
