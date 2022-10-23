package conditionalStatementsAdvanced;

import java.util.Scanner;

public class PersonalTitles04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double age = Double.parseDouble(sc.nextLine());
        String gender = sc.nextLine();
        if(gender.equals("m")){
            if (age >= 16){
                System.out.println("Mr.");
            } else System.out.println("Master");
        } else if (gender.equals("f")){
            if (age >= 16){
                System.out.println("Ms.");
            } else System.out.println("Miss");
        }
    }
}
