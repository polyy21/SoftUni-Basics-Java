package forLoop;

import java.util.Locale;
import java.util.Scanner;

public class Oscars06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Double academyScore = Double.parseDouble(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        Double score = academyScore;
        for (int i = 0; i < n; i++) {
            String judge = sc.nextLine();
            Double jScore = Double.parseDouble(sc.nextLine());
            score += (judge.length()*jScore)/2.0;
            if (score >= 1250.5) break;
        }
        if (score >= 1250.5) System.out.printf(Locale.US, "Congratulations, %s got a nominee for leading role with %.1f!", name, score);
        else System.out.printf(Locale.US,"Sorry, %s you need %.1f more!", name, 1250.5 - score);
    }
}
