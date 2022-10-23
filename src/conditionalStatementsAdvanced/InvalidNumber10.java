package conditionalStatementsAdvanced;

import java.util.Scanner;

public class InvalidNumber10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        if (!(num==0 || (num>=100 && num<=200))) System.out.println("invalid");
    }
}
