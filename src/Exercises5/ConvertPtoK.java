package Exercises5;

import java.util.Scanner;

// For one of the programming exercises in chap 2. you wrote a program
// that converted pounds to kilograms. Rewrite this program, so that
// the conversion takes place in a separate method which is called
// by the main method
public class ConvertPtoK {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        double pounds;
        System.out.println("Pounds?");
        pounds = kbd.nextDouble();
        System.out.println(pounds + " pounds are ");
        System.out.printf("%1.5f", convertPK(pounds));
        System.out.print(" kilos.");
    }

    static double convertPK(double pounds){
        return pounds /= 2.2;
    }
}
