package forLoop;

import java.util.Locale;
import java.util.Scanner;

public class TrekkingMania07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nGroups = Integer.parseInt(sc.nextLine());
        int people = 0;
        double musala = 0;
        double monblan = 0;
        double kilimanjaro = 0;
        double k2 = 0;
        double everest = 0;
        for (int i = 0; i < nGroups; i++) {
            int num = Integer.parseInt(sc.nextLine());
            people += num;
            if (num <= 5) musala += num;
            else if (num <= 12) monblan += num;
            else if (num <= 25) kilimanjaro += num;
            else if (num <= 40) k2 += num;
            else if (num >= 41) everest += num;
        }
        musala *= 100.0 / people;
        monblan *= 100.0 / people;
        kilimanjaro *= 100.0 / people;
        k2 *= 100.0 / people;
        everest *= 100.0 / people;
        System.out.printf(Locale.US,"%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n", musala, monblan, kilimanjaro, k2, everest);
    }
}
