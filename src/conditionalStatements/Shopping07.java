package conditionalStatements;

import java.util.Locale;
import java.util.Scanner;

public class Shopping07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int GPUs = Integer.parseInt(sc.nextLine());
        int CPUs = Integer.parseInt(sc.nextLine());
        int RAMs =  Integer.parseInt(sc.nextLine());
        sc.close();
        double priceGPUs = GPUs*250.0;
        double priceCPUs = priceGPUs*0.35*CPUs;
        double priceRAMs = priceGPUs*0.1*RAMs;
        double sum = priceGPUs + priceCPUs + priceRAMs;
        if (GPUs > CPUs) sum *= 0.85;
        if (budget < sum){
            sum -= budget;
            System.out.printf(Locale.US,"Not enough money! You need %.02f leva more!", sum);
        } else {
            budget -= sum;
            System.out.printf(Locale.US,"You have %.02f leva left!", budget);
        }
    }
}
