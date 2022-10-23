package firstSteps;

import java.util.Scanner;

public class FishTank09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int h = Integer.parseInt(sc.nextLine());
        float p = Float.parseFloat(sc.nextLine());
        p /= 100;
        System.out.println(0.001 * a*b*h * (1-p));
    }
}
