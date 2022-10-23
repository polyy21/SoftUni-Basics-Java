package forLoop;

import java.util.Scanner;

public class VowelsSum06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int sum = 0;
        for (int i = 0; i<string.length(); i++){
            switch (string.charAt(i)){
                case 'u':
                    sum++;
                case 'o':
                    sum++;
                case 'i':
                    sum++;
                case 'e':
                    sum++;
                case 'a':
                    sum++;
                    break;
            }
        }
        System.out.println(sum);
    }
}
