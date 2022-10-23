package nestedLoops;

import java.util.Locale;
import java.util.Scanner;

public class TrainTheTrainers04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int presentations = 0;
        double sumMarks = .0;
        while (!input.equals("Finish")) {
            String name = input;
            presentations++;
            double mark = .0;
            for (int i = 0; i < n; i++) {
                double m = Double.parseDouble(scanner.nextLine());
                mark += m;
            }
            mark /= n;
            sumMarks += mark;
            System.out.printf(Locale.US,"%s - %.2f.%n", name, mark);
            input = scanner.nextLine();
        }
        sumMarks /= presentations;
        System.out.printf(Locale.US,"Student's final assessment is %.2f.", sumMarks);
    }
}