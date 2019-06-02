package com.kauze77;

import java.util.Scanner;

public class IterationQ7 {

    public static void main(String[] args) {
        int num, square;
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter a number");
        num = kbd.nextInt();

        System.out.println("Enter the square of this number");
        square = kbd.nextInt();
        //loop to check answer

        while (square != Math.sqrt(num)){
            System.out.println("Wrong answer, try again");
            square = kbd.nextInt();
        }
        System.out.println("Well done, right answer");


    }
}
