package conditionalStatements;

import java.util.Scanner;

public class LunchBreak08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameOfSeries = sc.nextLine();
        double episodeLength = Integer.parseInt(sc.nextLine());
        double breakLength =  Integer.parseInt(sc.nextLine());
        sc.close();
        breakLength *= (1 - 1.0/8 - 1.0/4);
        if (breakLength >= episodeLength){
            breakLength -= episodeLength;
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameOfSeries, Math.ceil(breakLength));
        } else {
            episodeLength -= breakLength;
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameOfSeries, Math.ceil(episodeLength));
        }
    }
}
