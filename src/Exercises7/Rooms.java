package Exercises7;

import Questions7.Oblong;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Write a program that creates an array of
 * Oblong objects to represent the
 * dimensions of rooms in an apartment as
 * described in self test question 6. The
 * program should allow the user to
 *
 * (a) Determine the number of rooms
 * (b) Enter the dimensions of the rooms
 * (c) Retrieve the area and dimensions of
 * any of the rooms
 * */
public class Rooms {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("How many rooms had the department?");
        int numrooms = kbd.nextInt();

        ArrayList<Oblong> rooms = new ArrayList<>(numrooms);

        double length, height;
        for (int i = 1; i <= numrooms; i++) {

            System.out.println("Enter length of room " + i + " :");
            length = kbd.nextDouble();
            System.out.println("Enter height of room " + i + " : ");
            height = kbd.nextDouble();
            rooms.add(new Oblong(length, height));
        }

        for (Oblong r : rooms) {
            System.out.print("Room " + (rooms.indexOf(r) + 1) + " ");
            System.out.print("Height " + r.getHeight() + " Length " + r.getLength() + " Area: ");
            System.out.printf("%1.2f", r.calculateArea());
            System.out.println();
        }

    }


}
