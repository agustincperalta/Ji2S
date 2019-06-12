package Exercises6;
/*Design and implement a program that allows the user to enter into an array the
price of 5 products in pounds sterling. The program should then copy this array
into another array but convert the price of each product from pounds sterling to
US dollars. The program should allow the user to enter the exchange rate of
pounds to dollars, and should, when it terminates, display the contents of both
arrays. Once again, make use of methods in your program to carry out these
tasks.*/

import java.util.Scanner;

public class SterlingsDollars {
    public static void main(String[] args) {
        double[] productsPounds = new double[5];
        double[] productsDollars = new double[5];
        double exchangeRate;
        Scanner kbd = new Scanner(System.in);

        for (int i = 0; i < productsPounds.length; i++) {
            System.out.println("Enter the product (£)" + (i + 1) + ":");
            productsPounds[i] = kbd.nextDouble();
        }
        System.out.println("Please enter the exchange rate:");
        exchangeRate = kbd.nextDouble();


        // Copy the arrayPounds
        for (int i = 0; i < productsPounds.length; i++) {
            productsDollars[i] = productsPounds[i] * exchangeRate;
        }

        displayArray(productsPounds);
        System.out.println();
        displayArray(productsDollars);
    }

    static void displayArray(double... arrayIn) {
        for (double i : arrayIn) {
            System.out.printf("%1.2f", i);
            System.out.print(" ");


        }
    }
}
