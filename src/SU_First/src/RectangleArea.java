import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = Integer.parseInt(sc.next());
        b = Integer.parseInt(sc.next());
        int area = a*b;
        System.out.println(area);
    }
}
