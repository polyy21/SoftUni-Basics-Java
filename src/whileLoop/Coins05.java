package whileLoop;

import java.util.Scanner;

public class Coins05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double change = Double.parseDouble(sc.nextLine());
        //sc.close();
        double left = change * 100;
        int coins = 0;
        while (left > 0){
            if (left >= 200){
                left -= 200;
                coins++;
            } else if (left >= 100){
                left -= 100 ;
                coins++;
            } else if (left >= 50) {
                left -= 50;
                coins++;
            } else if (left >= 20) {
                left -= 20;
                coins++;
            } else if (left >= 10) {
                left -= 10;
                coins++;
            } else if (left >= 5) {
                left -= 5;
                coins++;
            } else if (left >= 2) {
                left -= 2;
                coins++;
            } else if (left >= 1) {
                coins += left;
                break;
            } else break;
        }
        System.out.println(coins);
    }
}