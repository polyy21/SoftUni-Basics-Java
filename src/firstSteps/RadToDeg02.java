package firstSteps;

import java.util.Scanner;

public class RadToDeg02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rad = Double.parseDouble(sc.nextLine());
        double deg = rad * 180/ Math.PI;
        System.out.println(deg);
    }
}
