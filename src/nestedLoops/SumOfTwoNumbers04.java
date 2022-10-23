package nestedLoops;

import java.util.Scanner;

public class SumOfTwoNumbers04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.nextLine());
        int fin = Integer.parseInt(sc.nextLine());
        int magic = Integer.parseInt(sc.nextLine());
        int count = 0;
        boolean found = false;
        for (int i = start; i <= fin && !found; i++) {
            for (int j = start; j <= fin && !found; j++) {
                count++;
                if (i + j == magic) {
                    found = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i , j, i+j);
                }
            }
        }
        if(!found) System.out.printf("%d combinations - neither equals %d", count, magic);
    }
}