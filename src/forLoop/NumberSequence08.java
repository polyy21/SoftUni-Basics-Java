package forLoop;

import java.util.Scanner;

public class NumberSequence08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++){
            int num = Integer.parseInt(sc.nextLine());
            if (num < min) min = num;
            if (max < num) max = num;
        }
        System.out.printf("Max number: %d%nMin number: %d", max, min);
    }
}
