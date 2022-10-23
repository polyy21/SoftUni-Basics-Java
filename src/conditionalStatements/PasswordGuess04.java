package conditionalStatements;

import java.util.Scanner;

public class PasswordGuess04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pwd = sc.nextLine();
        sc.close();
        if (pwd.equals("s3cr3t!P@ssw0rd")) System.out.println("Welcome");
        else System.out.println("Wrong password!");
    }
}
