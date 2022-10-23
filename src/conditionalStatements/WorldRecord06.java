package conditionalStatements;

import java.util.Locale;
import java.util.Scanner;

public class WorldRecord06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double record = Double.parseDouble(sc.nextLine());
        double distance = Double.parseDouble(sc.nextLine());
        double speed = Double.parseDouble(sc.nextLine());
        sc.close();
        double time = distance * speed;
        time += (((int)distance/15)*12.5);
        if (record <= time){
            time -= record;
            System.out.printf(Locale.US,"No, he failed! He was %.02f seconds slower.", time);
        } else {
            System.out.printf(Locale.US,"Yes, he succeeded! The new world record is %.02f seconds.", time);
        }
    }
}
