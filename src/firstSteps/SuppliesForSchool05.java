package firstSteps;

import java.util.Scanner;

public class SuppliesForSchool05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pens = Integer.parseInt(sc.nextLine());
        int markers = Integer.parseInt(sc.nextLine());
        int pr = Integer.parseInt(sc.nextLine());
        double percentage = Double.parseDouble(sc.nextLine());
        percentage /= 100;
        double sum = (1 - percentage) * (5.8 * pens + 7.2 * markers + 1.2 * pr);
        System.out.println(sum);
    }
}
