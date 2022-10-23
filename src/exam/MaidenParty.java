package exam;

import java.util.Locale;
import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double partyPrice = Double.parseDouble(scanner.nextLine());
        int numLoveLetters = Integer.parseInt(scanner.nextLine());
        int numWaxRoses = Integer.parseInt(scanner.nextLine());
        int numKeyChains = Integer.parseInt(scanner.nextLine());
        int numCaricatures = Integer.parseInt(scanner.nextLine());
        int numLuckyCharms = Integer.parseInt(scanner.nextLine());

        double shopIncome = numLoveLetters * 0.6 + numWaxRoses * 7.2 + numKeyChains * 3.6 + numCaricatures * 18.2 + numLuckyCharms * 22.;
        if ((numLoveLetters + numWaxRoses + numKeyChains + numCaricatures + numLuckyCharms) >= 25) {
            shopIncome *= (1 - 0.35); //discount
        }
        shopIncome *= 0.9; //10% hosting

        if (partyPrice <= shopIncome) {
            System.out.printf(Locale.US, "Yes! %.2f lv left.", shopIncome - partyPrice);
        } else {
            System.out.printf(Locale.US, "Not enough money! %.2f lv needed.", partyPrice - shopIncome);
        }
    }
}
