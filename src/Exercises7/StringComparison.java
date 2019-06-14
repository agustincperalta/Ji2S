package Exercises7;

import java.util.Scanner;

/*
 * Adapt the StringComparison program which compares two strings,
 * int the following ways:
 * (a) Rewrite the program so that it ignores case;
 * (b) Rewrite the program, using the equals method, so that it
 * does is to test whether the two strings are the same
 * (c) Repeat (b) using the equalsIgnoreCase method;
 * (d) Use the trim method so that the program ignores leading or trailing spaces
 *
 * */
public class StringComparison {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String str1, str2;
        int comparison;

        // get two strings from the user
        System.out.println("Enter a string: ");
        str1 = kbd.next();
        System.out.println("Enter another String: ");
        str2 = kbd.next();

        if (str1.trim().equalsIgnoreCase(str2.trim())){
            System.out.println("The strings are identical");
        } else{
            System.out.println("The strings are different");
        }
        /*
        if (str1.toLowerCase().equals(str2.toLowerCase())) {
            System.out.println("The strings are identical");
        } else {
            System.out.println("The strings are different");

        }
        */

/*
        // compare the strings ignoring case
        comparison = str1.toLowerCase().compareTo(str2.toLowerCase());
        if (comparison < 0) { // compareTo returned a negative number
            System.out.println(str1 + " comes before " + str2 + " int the alphabet");
        } else if(comparison > 0 ) { // compareTo returned a positive number
            System.out.println(str2 + " comes before " + str1 + " int the alphabet" );
        } else { // compareTo returned zero
            System.out.println("The strings are identical");


 */
    }
}

