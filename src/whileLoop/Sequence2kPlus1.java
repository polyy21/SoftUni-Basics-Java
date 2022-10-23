package whileLoop;

import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int num = 1;
        while (num <= n){
            System.out.println(num);
            num = 2*num + 1;
        }
    }
}
