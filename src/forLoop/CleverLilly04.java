package forLoop;

import java.util.Locale;
import java.util.Scanner;

public class CleverLilly04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double priceMachine = Double.parseDouble(sc.nextLine());
        int toyPrice = Integer.parseInt(sc.nextLine());
        double money = 0.0;
        for (int i=1; i<=n; i++){
            if(i%2==0){
                money--;
            } else {
                money += toyPrice;
            }
        }
        money += n/2 * (2*10.0 + (n/2-1)*10.0)/2;
        if (money >= priceMachine) System.out.printf(Locale.US,"Yes! %.2f", money-priceMachine);
        else System.out.printf(Locale.US,"No! %.2f", priceMachine-money);
    }
}
