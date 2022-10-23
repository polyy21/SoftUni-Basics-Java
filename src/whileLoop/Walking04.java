package whileLoop;

import java.util.Scanner;

public class Walking04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int allSteps = 0;
        String input = "";
        int currentSteps;
        boolean home = false;
        while (allSteps < 10000 && !home) {
            input = sc.nextLine();
            if (input.equals("Going home")) {
                home = true;
                input = sc.nextLine();
            }
            currentSteps = Integer.parseInt(input);
            allSteps += currentSteps;
        }
        int diff = Math.abs(10000 - allSteps);
        if (allSteps >= 10000) System.out.printf("Goal reached! Good job!%n%d steps over the goal!%n", diff);
        else System.out.printf("%d more steps to reach goal.", diff);
    }
}