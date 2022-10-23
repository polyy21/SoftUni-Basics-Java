package forLoop;

import java.util.Locale;
import java.util.Scanner;

public class Histogram03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double p1=.0, p2=.0, p3=.0, p4=.0, p5=.0;
        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(sc.nextLine());
            if (num<200) p1++;
            else if (num>=200 && num<=399) p2++;
            else if (num>=400 && num<=599) p3++;
            else if (num>=600 && num<=799) p4++;
            else if (num>=800) p5++;
        }
        p1 *= 100.0/n;
        p2 *= 100.0/n;
        p3 *= 100.0/n;
        p4 *= 100.0/n;
        p5 *= 100.0/n;
        System.out.printf(Locale.US,"%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n", p1, p2, p3, p4, p5);
    }
}
