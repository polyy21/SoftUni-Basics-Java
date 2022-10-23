package conditionalStatements;

import java.util.Locale;
import java.util.Scanner;

public class ToyShop04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double excursion = Double.parseDouble(sc.nextLine());
        int puzzles = Integer.parseInt(sc.nextLine());
        int puppets = Integer.parseInt(sc.nextLine());
        int teddyBears = Integer.parseInt(sc.nextLine());
        int minions = Integer.parseInt(sc.nextLine());
        int trucks = Integer.parseInt(sc.nextLine());
        sc.close();
        int numberOfToys = puzzles + puppets + teddyBears + minions + trucks;
        double sumOfToys = puzzles*2.6 + puppets*3 + teddyBears*4.1 + minions*8.2 + trucks*2;
        double discount = 0;
        if (numberOfToys >= 50) discount = 0.25 * sumOfToys;
        double total = sumOfToys - discount;
        total *= 0.9;
        if (total >= excursion){
            total -= excursion;
            System.out.printf(Locale.US,"Yes! %.02f lv left.", total);
        }
        else {
            excursion -= total;
            System.out.printf(Locale.US,"Not enough money! %.02f lv needed.", excursion);
        }
    }
}
