package conditionalStatements;

import java.util.Scanner;

public class TimePlus15minutes03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        sc.close();
        if (60-m <= 15){
            h++;
            m += 15;
            if (m >= 60) m -= 60;
        }
        else m+=15;
        if (h>=24) h-=24;
        System.out.printf("%d:%02d", h, m);
    }
}
