package nestedLoops;

import java.util.Scanner;

public class EqualSumsEvenOddPositions02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int i = n1; i <= n2; i++) {
            int num = i;
            int oddSum = 0;
            int evenSum = i%10;
            num /=10;
            for (int j = 0; j < 5; j++) {
                if (j%2==0){
                    oddSum += num%10;
                } else evenSum += num%10;
                num /= 10;
            }
            if (oddSum == evenSum) System.out.print(i + " ");
        }
    }
}
