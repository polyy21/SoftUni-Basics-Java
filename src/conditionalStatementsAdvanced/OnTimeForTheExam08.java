package conditionalStatementsAdvanced;

import java.util.Scanner;

public class OnTimeForTheExam08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hExam = Integer.parseInt(sc.nextLine());
        int mExam = Integer.parseInt(sc.nextLine());
        int hStudent = Integer.parseInt(sc.nextLine());
        int mStudent = Integer.parseInt(sc.nextLine());
        String isLate = "";
        int mLate = (hStudent - hExam)*60 + mStudent - mExam;
        if (mLate <= 0 && (0-mLate) <= 30) isLate = "On time";
        else isLate = (mLate > 0) ? "Late" : "Early";
        System.out.println(isLate);
        if (mLate >= 1 || mLate <= -1){
            if (isLate.equals("Early") || isLate.equals("On time")) {
                if ((0-mLate) < 60) System.out.printf("%d minutes before the start", (0-mLate));
                else System.out.printf("%d : %02d hours before the start", (0-mLate)/60, (0-mLate)%60);
            } else if (isLate.equals("Late")){
                if (mLate < 60) System.out.printf("%d minutes after the start", mLate);
                else System.out.printf("%d : %02d hours after the start", mLate/60, mLate%60);
            }
        }
    }
}
