package exam;

import java.util.Locale;
import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //in usd
        double priceCPU = Double.parseDouble(scanner.nextLine());
        double priceGPU = Double.parseDouble(scanner.nextLine());
        double priceRAM = Double.parseDouble(scanner.nextLine());
        int numRAM = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        //discount
        priceCPU *= (1.0 - discount);
        priceGPU *= (1.0 - discount);

        //sum in usd
        double sum = priceCPU + priceGPU + numRAM*priceRAM;

        //sum in leva
        sum *= 1.57;

        System.out.printf(Locale.US, "Money needed - %.2f leva.", sum);
    }
}