package firstSteps;

import java.util.Scanner;

public class DepositCalc03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dep = Double.parseDouble(sc.nextLine());
        double period = Integer.parseInt(sc.nextLine());
        double percent = Double.parseDouble(sc.nextLine());
        double sum = dep + period * ((dep * percent/100)/12);
        System.out.println(sum);
    }
}
