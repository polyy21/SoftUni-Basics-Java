package forLoop;

import java.util.Scanner;

public class OddEvenSum10 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = Integer.parseInt(sc.nextLine());
         int evenSum = 0;
         int oddSum = 0;
         for (int i = 1; i<=n; i++){
             int num = Integer.parseInt(sc.nextLine());
             if(i%2==0) evenSum += num;
             else oddSum += num;
         }
         if (evenSum == oddSum) System.out.printf("Yes%nSum = %d", evenSum);
         else System.out.printf("No%nDiff = %d", Math.abs(evenSum - oddSum));
     }
}
