package whileLoop;

import java.util.Scanner;

public class Cake06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = Integer.parseInt(sc.nextLine());
        int w = Integer.parseInt(sc.nextLine());
        int total = w * l;
        String input = "";
        while (total>0){
            input = sc.nextLine();
            if (input.equals("STOP")) break;
            int slices = Integer.parseInt(input);
            total -= slices;
        }
        if (input.equals("STOP")) System.out.printf("%d pieces are left.", total);
        else System.out.printf("No more cake left! You need %d pieces more.", 0-total);
    }
}
