package whileLoop;

import java.util.Locale;
import java.util.Scanner;

public class ExamPreparation02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int poorMarksThreshold = Integer.parseInt(sc.nextLine());
        String input = "";
        int failedTimes = 0;
        int solvedProblems = 0;
        double sumMarks = .0;
        String lastProblem = "";
        while(failedTimes<poorMarksThreshold) {
            input = sc.nextLine();
            if (input.equals("Enough")) break;
            int grade = Integer.parseInt(sc.nextLine());
            if (grade <= 4) failedTimes++;
            sumMarks += grade;
            solvedProblems++;
            lastProblem = input;
        }
        double averageGrade = sumMarks / solvedProblems;
        if (failedTimes>=poorMarksThreshold) System.out.printf("You need a break, %d poor grades.", failedTimes);
        else System.out.printf(Locale.US,"Average score: %.2f%nNumber of problems: %d%nLast problem: %s%n", averageGrade, solvedProblems, lastProblem);
    }
}