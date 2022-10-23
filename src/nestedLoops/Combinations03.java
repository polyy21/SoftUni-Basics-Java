package nestedLoops;

import java.util.Scanner;

public class Combinations03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    if ( i + j + k == n) count++;
                }
            }
        }
        System.out.println(count);
    }
}
