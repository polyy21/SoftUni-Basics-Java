package exam;

import java.util.Locale;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        int group2 = 0; //2.00 - 2.99
        int group3 = 0; //3.00 - 3.99
        int group4 = 0; //4.00 - 4.99
        int group5 = 0; //5.00 - 5.99
        double sumMarks = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            double mark = Double.parseDouble(scanner.nextLine());
            sumMarks += mark;
            if (mark < 3.0) group2++;
            else if (mark < 4.0) group3++;
            else if (mark < 5.0) group4++;
            else group5++;
        }

        int allStudents = group2 + group3 + group4 + group5;
        double averageScore = sumMarks / allStudents;
        System.out.printf(Locale.US, "Top students: %.2f%%%n", group5 * 1.0 / allStudents * 100);
        System.out.printf(Locale.US, "Between 4.00 and 4.99: %.2f%%%n", group4 * 1.0 / allStudents * 100);
        System.out.printf(Locale.US, "Between 3.00 and 3.99: %.2f%%%n", group3 * 1.0 / allStudents * 100);
        System.out.printf(Locale.US, "Fail: %.2f%%%n", group2 * 1.0 / allStudents * 100);
        System.out.printf(Locale.US, "Average: %.2f%n", averageScore);
    }
}
