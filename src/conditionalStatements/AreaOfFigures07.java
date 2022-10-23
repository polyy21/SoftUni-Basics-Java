package conditionalStatements;

import java.util.Locale;
import java.util.Scanner;

public class AreaOfFigures07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        double area = 0;
        if (type.equals("square")){
            double side = Double.parseDouble(sc.nextLine());
            area = side * side;
            System.out.printf(Locale.US,"%.3f%n", area);
        } else if (type.equals("rectangle")) {
            double side1 = Double.parseDouble(sc.nextLine());
            double side2 = Double.parseDouble(sc.nextLine());
            area = side1 * side2;
            System.out.printf(Locale.US,"%.3f%n", area);
        } else if (type.equals("circle")) {
            double r = Double.parseDouble(sc.nextLine());
            area = r * r * Math.PI;
            System.out.printf(Locale.US,"%.3f%n", area);
        } else if (type.equals("triangle")) {
            double side = Double.parseDouble(sc.nextLine());
            double h = Double.parseDouble(sc.nextLine());
            area = side * h / 2;
            System.out.printf(Locale.US,"%.3f%n", area);
        }
        sc.close();
    }
}
