package nestedLoops;

import java.util.Scanner;

public class Building06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int floors = Integer.parseInt(sc.nextLine());
        int rooms = Integer.parseInt(sc.nextLine());
        char type = 'L';
        for (int i = floors; i >= 1; i--) {
            for (int j = 0; j < rooms; j++) {
                if (floors != 1 && i%2 == 1 && floors != i) type='A';
                else if (i%2 == 0 && floors != i) type='O';
                System.out.printf("%s%d%d ", type, i, j);
            }
            System.out.println();
        }
    }
}
