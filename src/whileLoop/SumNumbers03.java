package whileLoop;

import java.util.Scanner;

public class SumNumbers03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        while (sum < n){
            int newNum = Integer.parseInt(sc.nextLine());
            sum += newNum;
        }
        System.out.println(sum);
    }
}
