package conditionalStatements;

import java.util.Scanner;

public class BonusScore02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        sc.close();
        double bonus = 0;
        if (num <= 100) bonus = 5;
        else if (num > 1000) bonus = num * 0.1;
        else bonus = num * 0.2;
        if (num % 2 == 0) bonus++;
        else if (num % 10 == 5) bonus += 2;
        System.out.println(bonus);
        System.out.println(num + bonus);
    }
}
