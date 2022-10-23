package whileLoop;

import java.util.Scanner;

public class ReadText01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("Stop")){
            System.out.println(input);
            input = sc.nextLine();
        }
    }
}
