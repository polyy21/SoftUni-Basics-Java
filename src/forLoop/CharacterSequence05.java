package forLoop;

import java.util.Scanner;

public class CharacterSequence05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        for (int i = 0; i<string.length(); i++){
            System.out.println(string.charAt(i));
        }
    }
}
