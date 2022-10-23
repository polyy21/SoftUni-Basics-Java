package whileLoop;

import java.util.Scanner;

public class Moving07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = Integer.parseInt(sc.nextLine());
        int l = Integer.parseInt(sc.nextLine());
        int h = Integer.parseInt(sc.nextLine());
        int total = w * l * h;
        String input = "";
        while (total>0){
            input = sc.nextLine();
            if (input.equals("Done")) break;
            int boxes = Integer.parseInt(input);
            total -= boxes;
        }
        if (input.equals("Done")) System.out.printf("%d Cubic meters left.", total);
        else System.out.printf("No more free space! You need %d Cubic meters more.", 0-total);
    }
}