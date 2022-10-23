package firstSteps;

import java.util.Scanner;

public class VacationReadList04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int allPages = Integer.parseInt(sc.nextLine());
        int pagesPerHour = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());
        int hours = (allPages / pagesPerHour) / days;
        System.out.println(hours);
    }
}
