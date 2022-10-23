import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inch;
        inch = Double.parseDouble(sc.next());
        System.out.println(inch*2.54);
    }
}
