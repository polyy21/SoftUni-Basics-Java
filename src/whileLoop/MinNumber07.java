package whileLoop;

import java.util.Scanner;

public class MinNumber07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        String input = sc.nextLine();
        while (!input.equals("Stop")){
            int n = Integer.parseInt(input);
            if (n < min){
                min = n;
            }
            input = sc.nextLine();
        }
        System.out.println(min);
    }
}
