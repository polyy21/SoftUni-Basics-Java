package whileLoop;

import java.util.Locale;
import java.util.Scanner;

public class Graduation08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double gradeSum = .0;
        int grades = 0;
        boolean failing = false;

        while (grades < 12){
            double grade = Double.parseDouble(sc.nextLine());
            if (grade < 4.) {
                if (!failing){
                    failing = true;
                    continue;
                } else break;
            }
            grades++;
            gradeSum += grade;
        }
        double averageGrade = gradeSum/grades;
        if (!failing) System.out.printf(Locale.US,"%s graduated. Average grade: %.2f", name, averageGrade);
        else System.out.printf("%s has been excluded at %d grade", name, grades+1);
    }
}