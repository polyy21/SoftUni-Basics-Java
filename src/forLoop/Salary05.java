package forLoop;

import java.util.Scanner;

public class Salary05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double salary = Double.parseDouble(sc.nextLine());
        for (int i = 0; i < n; i++){
            String site = sc.nextLine();
            if (site.equals("Facebook")) salary -= 150;
            else if (site.equals("Instagram")) salary -= 100;
            else if (site.equals("Reddit")) salary -= 50;
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                return;
            }
        }
        System.out.printf("%d", (int)salary);
    }
}
