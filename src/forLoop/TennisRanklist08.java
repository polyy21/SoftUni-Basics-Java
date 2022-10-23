package forLoop;

import java.util.Locale;
import java.util.Scanner;

public class TennisRanklist08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tournaments = Integer.parseInt(sc.nextLine());
        int startPoints = Integer.parseInt(sc.nextLine());
        int newPoints = 0;
        int wins = 0;
        for (int i = 0; i < tournaments; i++) {
            String stage = sc.nextLine();
            if (stage.equals("W")) {
                newPoints += 2000;
                wins++;
            }
            else if (stage.equals("F")) newPoints += 1200;
            else if (stage.equals("SF")) newPoints += 720;
        }
        System.out.printf(Locale.US,"Final points: %d%nAverage points: %d%n%.2f%%%n", (startPoints+newPoints), (newPoints/tournaments), (wins * 1.0 / tournaments)*100);
    }
}
