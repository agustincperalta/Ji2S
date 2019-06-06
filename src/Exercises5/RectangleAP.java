package Exercises5;

import java.util.Scanner;

// In the exercises at the end of Chap.2 you were asked to write
// a program that calculated the area and perimeter of a rectangle.
// Re-write this program so that now the instructions for calculating
// the area and perimeter of the rectangle are contained
// int two separate methods
public class RectangleAP {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("*** Área y Perimetro del Rectangulo ***");
        System.out.println("altura?");
        double altura = kbd.nextDouble();
        System.out.println("base?");
        double base = kbd.nextDouble();
        System.out.println("El área del rectangulo es: " +
                areaR(base, altura));
        System.out.println("El perimetro del rectangulo es: " +
        perimeterR(base, altura));

    }

    private static double areaR(double base, double altura) {
        return base * altura;
    }

    private static double perimeterR(double base, double altura) {
        return (base * 2) + (altura * 2);
    }

}
