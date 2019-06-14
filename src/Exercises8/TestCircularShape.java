package Exercises8;

import java.util.Scanner;

/*
* (c) Write a program to test out your class. This program should allow the user
to enter a value for the radius of the circle, and then display the area,
circumference and diameter of this circle on the screen by calling the
appropriate methods of the CircularShape class.
*
* (d) Modify the tester program above so that once the information has been
displayed the user is able to reset the radius of the circle. The area,
*  circumference and diameter of the circle should then be displayed again.
* */
public class TestCircularShape {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle:");
        double radius = kbd.nextDouble();
        CircularShape c = new CircularShape(radius);
        showCalculations(c);
        System.out.println("Please re-enter the radius again:");
        radius = kbd.nextDouble();
        c.setRadius(radius);
        showCalculations(c);
    }

    public static void showCalculations(CircularShape c){
        System.out.print("The area is: ");
        System.out.printf("%1.2f", c.calculateArea());
        System.out.println();
        System.out.print("The circumference is: ");
        System.out.printf("%1.2f", c.calculateCircumference());
        System.out.println();
        System.out.print("The diameter is: ");
        System.out.printf("%1.2f", c.calculateDiameter());
        System.out.println();
    }
}
