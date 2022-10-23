package whileLoop;

import java.util.Scanner;

public class OldBooks01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String book = sc.nextLine();
        String input = sc.nextLine();
        int n = 0;
        boolean success = false;
        while (!input.equals("No More Books")){
            if (input.equals(book)){
                success = true;
                break;
            }
            n++;
            input = sc.nextLine();
        }
        if (success) System.out.printf("You checked %d books and found it.", n);
        else System.out.printf("The book you search is not here!%nYou checked %d books.", n);
    }
}
