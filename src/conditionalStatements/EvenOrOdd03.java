package conditionalStatements;

import java.util.Scanner;

public class EvenOrOdd03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        if (a % 2 == 0) System.out.println("even");
        else System.out.println("odd");
    }
}