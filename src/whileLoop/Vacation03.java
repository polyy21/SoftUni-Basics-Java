package whileLoop;

import java.util.Scanner;

public class Vacation03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double neededAmount = Double.parseDouble(sc.nextLine());
        double balance = Double.parseDouble(sc.nextLine());
        int consecutiveDaysSpending = 0;
        int days = 0;

        while (consecutiveDaysSpending<5 && neededAmount>balance){
            String type = sc.nextLine();
            double amount = Double.parseDouble(sc.nextLine());
            if (type.equals("spend")) {
                consecutiveDaysSpending++;
                if (balance >= amount) balance -= amount;
                else balance = .0;
            } else if (type.equals("save")){
                consecutiveDaysSpending = 0;
                balance += amount;
            }
            days++;
        }
        if (consecutiveDaysSpending==5) System.out.printf("You can't save the money.%n%d", days);
        else if (neededAmount <= balance) System.out.printf("You saved the money for %d days.", days);
        else System.out.printf("error");
    }
}
