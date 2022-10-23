package whileLoop;

import java.util.Scanner;

public class MaxNumber06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String input = sc.nextLine();
        while (!input.equals("Stop")){
            int m = Integer.parseInt(input);
            if (m > max){
                max = m;
            }
            input = sc.nextLine();
        }
        System.out.println(max);
    }
}