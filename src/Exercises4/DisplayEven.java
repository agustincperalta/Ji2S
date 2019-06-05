package Exercises4;

import java.util.Scanner;

/*
 * 2
 * (a) Modify DisplayEven program so that the program displays
 * the even numbers from 1 to 20 instead of from 10 down to 1.
 * (b) Modify the program further so that the user enters a number
 * and the program displays all the even numbers from 1
 * up to the number entered by the user.
 * (c) Modify the program again so that it identifies which
 * of these numbers are odd and which are even. For example,
 * if the user entered 5 the program should display something
 * like the following:
 * 1 is odd
 * 2 is even
 * 3 is odd
 * 4 is even
 * ...
 * */
public class DisplayEven {
    public static void main(String[] args) {
        int userNumber;

        System.out.println("*** Even & Odds numbers from 1 to n ***");
        System.out.println();
        Scanner kbd = new Scanner(System.in);
        // for (int i = 1; i <= 20; i++) { // (a)
        System.out.println("Enter a number, please");
        userNumber = kbd.nextInt();
        for (int i = 1; i <= userNumber; i++){
            // body of the loop contains in 'if' statement

            if (i % 2 == 0) { // check if number is even
                System.out.println(i + " is even"); // number displayed only when it is checked to be even
            } else{
                System.out.println(i + " is odd");
            }
        }
    }
}
