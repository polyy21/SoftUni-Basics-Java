package conditionalStatements;

import java.util.Locale;
import java.util.Scanner;

public class GodzillaVsKong05 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double budget = Double.parseDouble(sc.nextLine());
         int extras = Integer.parseInt(sc.nextLine());
         double pricePerExtra = Double.parseDouble(sc.nextLine());
         sc.close();
         //decor
         budget *= 0.9;
         double outfits = pricePerExtra * extras;
         if (extras > 150) outfits *= 0.9;
         if (budget - outfits >=0){
             budget -= outfits;
             System.out.printf(Locale.US,"Action!%nWingard starts filming with %.02f leva left.", budget);
         } else {
             outfits -= budget ;
             System.out.printf(Locale.US,"Not enough money!%nWingard needs %.02f leva more.", outfits);
         }
     }
}
