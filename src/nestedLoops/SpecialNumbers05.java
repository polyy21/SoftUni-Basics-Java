package nestedLoops;

import java.util.Scanner;

public class SpecialNumbers05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1111; i <= 9999; i++) {
            int num = i;
            int digit = 0;
            boolean isDivider = true;
            for (int j = 1; j <= 4; j++) {
                digit = num % 10;
                num /= 10;
                if (digit == 0 || n % digit != 0){
                    isDivider = false;
                    break;
                }
            }
            if (isDivider) System.out.print(i + " ");
        }

    }
}