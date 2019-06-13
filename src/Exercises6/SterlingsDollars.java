package Exercises6;
/*Design and implement a program that allows the user to enter into an array the
price of 5 products in pounds sterling. The program should then copy this array
into another array but convert the price of each product from pounds sterling to
US dollars. The program should allow the user to enter the exchange rate of
pounds to dollars, and should, when it terminates, display the contents of both
arrays. Once again, make use of methods in your program to carry out these
tasks.*/

/*
 * Amend the program above so that
 * (a) the user is asked how many items they wish to purchase and the arrays
 * are then sized accordingly;
 *
 * (b) the total cost of the order is displayed in both currencies
 * */

import java.util.Scanner;

public class SterlingsDollars {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int size;
        do {
            System.out.println("How many items do you want to purchase?");
            size = kbd.nextInt();
            if (size <= 0) {
                System.out.println("Invalid value");
                System.out.println("Try again");
            }
        } while (size <= 0);
        double[] productsYen = new double[size];
        double[] productsDollars = new double[size];
        double exchangeRate;

        for (int i = 0; i < productsYen.length; i++) {
            System.out.println("Enter the product (¥)" + (i + 1) + ":");
            productsYen[i] = kbd.nextDouble();
        }
        System.out.println("Please enter the exchange rate:");
        exchangeRate = kbd.nextDouble();


        // Copy the arrayPounds
        for (int i = 0; i < productsYen.length; i++) {
            productsDollars[i] = productsYen[i] * exchangeRate;
        }

        displayArray(productsYen);
        System.out.println();
        displayArray(productsDollars);
        System.out.println();
        System.out.println("The first total is: " + calculateTotal(productsYen));
        System.out.println("The second total is: " + calculateTotal(productsDollars));
    }

    static void displayArray(double... arrayIn) {
        for (double i : arrayIn) {
            System.out.printf("%1.2f", i);
            System.out.print(" ");


        }
    }

    static double calculateTotal(double ... arrayIn){
        double total = 0;
        for (double i: arrayIn) {
            total += i;
        }
        return total;
    }
}
