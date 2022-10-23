package forLoop;

import java.util.Scanner;

public class HalfSumElement02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i=1; i<=n; i++){
            int num = Integer.parseInt(sc.nextLine());
            sum += num;
            if (num > max) max = num;
        }
        int sumWOMaxNum = sum - max;
        if (max == sumWOMaxNum) System.out.printf("Yes%nSum = %d%n", max);
        else System.out.printf("No%nDiff = %d%n", Math.abs(max - sumWOMaxNum));
    }
}
