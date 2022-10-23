package conditionalStatementsAdvanced;

import java.util.Locale;
import java.util.Scanner;

public class OperationsBetweenNumbers06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        char operator = sc.nextLine().charAt(0);
        String even = "";
        int sum = 0;
        double div = 0.0;
        switch (operator) {
            case '+':
                sum = n1 + n2;
                break;
            case '-':
                sum = n1 - n2;
                break;
            case '*':
                sum = n1 * n2;
                break;
            case '/':
                if (n2 != 0) div = n1 * 1.0 / n2;
                break;
            case '%':
                if (n2 != 0) sum = n1 % n2;
                break;
        }
        if (n2 == 0 || (sum == 0 && div == 0.0)) {
            System.out.printf("Cannot divide %d by zero", n1);
        } else if (operator != '/') {
            if (operator != '%') even = (sum % 2 == 0) ? " - even" : " - odd";
            System.out.printf("%d %s %d = %d%s", n1, operator, n2, sum, even);
        } else {
            System.out.printf(Locale.US,"%d %s %d = %.2f", n1, operator, n2, div);
        }
    }
}
