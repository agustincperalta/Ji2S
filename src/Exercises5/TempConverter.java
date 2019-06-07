package Exercises5;
// (a) Write a menu-driven program that provides three options:
// **The first option allows the user to enter a temperature
// in Celsius and displays the corresponding Fahrenheit temperature;
// **The second option allows the user to enter a temperature in
// Fahrenheit and displays the corresponding Celsius temperature
// **The third option allows the user to quit
// The formula that you need are as follows, where C represents
// a Celcius Temperature and F a Fahrenheit temperature:
// F = [(9C)/5] + 32
// C = [5(F -32)]/ 9

// (b) Adapt the above program so that the user is not allowed to
// enter a temperature below absolute zero; this is -273.15C or
// -459.67F

import java.awt.*;
import java.util.Scanner;

public class TempConverter {
    private static Scanner kbd = new Scanner(System.in);
    private static Scanner kbd2 = new Scanner(System.in);

    public static void main(String[] args) {
        int value;
        String answer;
        boolean anotherFlag = true;
        do {
            do {
                drawMenu();
                value = kbd.nextInt();
                if (value > 3 || value < 1) {
                    System.out.println("Valor invalido\nIntenta de nuevo");
                }
            } while (value > 3 || value < 1);


            switch (value) {
                case 1:
                    int celcius = 0;
                    do {
                        System.out.println("C° ");
                        celcius = kbd.nextInt();
                        if (isValidC(celcius)){
                            System.out.println("Valor invalido");
                        }
                    } while (isValidC(celcius));
                    System.out.println(celcius + " C° = " + convertCF(celcius) + "F°");
                    break;
                case 2:
                    int fhar = 0;
                    do {
                        System.out.println("F° ");
                        fhar = kbd.nextInt();
                        if (isValidC(fhar)){
                            System.out.println("Valor invalido");
                        }
                    } while (isValidF(fhar));
                    System.out.println(fhar + "F° = " + convertCF(fhar) + "C°");
                    break;
            }
            do {
                System.out.println("Again?(Y|N)");
                answer = kbd2.nextLine();
                if (!answer.equalsIgnoreCase("n") && !answer.equalsIgnoreCase("y")) {
                    System.out.println("Valor invalido\nIntenta de nuevo");
                }


            } while (!answer.equalsIgnoreCase("n") && !answer.equalsIgnoreCase("y"));

            if (answer.equalsIgnoreCase("n")) {
                break;
            } else if (answer.equalsIgnoreCase("y")) {
                continue;
            }
        } while (anotherFlag);

    }

    // Imprime menu
    static void drawMenu() {
        System.out.println("1. C° to F°");
        System.out.println("2. F° to C°");
        System.out.println("3. Quit");
    }

    // Celcius to Fahrenheit
    static double convertCF(double celcius) {
        return ((9 * celcius) / 5) + 32;
    }

    // Fahrenheit to Celcius
    static double convertFC(double fahr) {
        return (fahr - 32) * ((double) 5 / (double) 9);
    }

    static boolean isValidC(double celcius) {
        return celcius <= -273.15;
    }

    static boolean isValidF(double fhar) {
        return fhar <= -459.67;
    }
}
