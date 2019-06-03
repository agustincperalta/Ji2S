package Questions;

import java.util.Scanner;

public class IterationQ3 {
    public static void main(String[] args) {
        int num;
        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num = kbd.nextInt();

        for (int i = 1; i < num; i++) {
            System.out.println("YES");
            System.out.println("NO");

        }
        System.out.println("OK      ");
    }
}
