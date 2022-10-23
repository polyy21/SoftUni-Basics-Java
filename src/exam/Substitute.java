package exam;

import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        //first 6 of
        //n1 {k}{l}     n1(1) [k, 8] , n1(2) [9, l]
        //n2 {m}{n}     n2(1) [m, 8] , n2(2) [9, n]
        // nx(1) even, nx(2) odd; n1 != n2

        int validSubs = 0;

        for (int a1 = k; a1 <= 8 && validSubs < 6; a1++) {
            if (a1 % 2 == 0){
                for (int a2 = 9; a2 >= l && validSubs < 6; a2-=2) {
                    for (int b1 = m; b1 <= 8 && validSubs < 6; b1++) {
                        if (b1 % 2 == 0){
                            for (int b2 = 9; b2 >= n && validSubs < 6; b2-=2) {
                                if (a1 == b1 && a2 == b2) System.out.println("Cannot change the same player.");
                                else{
                                    validSubs++;
                                    System.out.printf("%d%d - %d%d%n", a1,a2, b1,b2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}