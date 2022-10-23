package nestedLoops;

import java.util.Scanner;

public class SumPrimeNonPrime03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;
        while (!input.equals("stop")) {
            int num = Integer.parseInt(input);
            input = scanner.nextLine();
            if (num<0) {
                System.out.println("Number is negative.");
                continue;
            }
            if (num==0) continue;
            boolean isPrime = true;
            for (int i = 2; i <= num/2; i++) {
                if (num%i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) sumPrime += num;
            else sumNonPrime += num;
        }
        System.out.printf("Sum of all prime numbers is: %d%n" +
                "Sum of all non prime numbers is: %d%n", sumPrime, sumNonPrime);
    }
}
