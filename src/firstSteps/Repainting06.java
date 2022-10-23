package firstSteps;

import java.util.Locale;
import java.util.Scanner;

public class Repainting06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nailon = Integer.parseInt(sc.nextLine());
        double paint = Integer.parseInt(sc.nextLine());
        double razr = Integer.parseInt(sc.nextLine());
        int hs = Integer.parseInt(sc.nextLine());
        nailon = (nailon + 2) * 1.5;
        paint = (11.0/10.0 * paint) * 14.5;
        razr *= 5.0;
        double materials = (nailon + paint + razr + 0.4);
        double workers = 3.0/10 * materials * hs;
        double all = materials + workers;
        System.out.printf(Locale.US,"%.2f", all);
    }
}
