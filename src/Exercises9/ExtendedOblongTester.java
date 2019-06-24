package Exercises9;

/*
* 1. (a) Copy the ExtendedOblog class from the website, then implement
* the ExtendedOblongTester form Sect. 9.4. You will, of course, need to
* ensure that the Oblong class itself is accessible to the compiler
*
* (b) Modify the ExtendedOblogTester program so that the user is able to
* choose the symbol used to display the oblong
*
*
*
* */

import java.util.Scanner;

public class ExtendedOblongTester {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        ExtendedOblong extOblong = new ExtendedOblong(10.2, 5.3, '*');
        System.out.println(extOblong.draw());

        System.out.println("Give me the symbol to draw the figure");
        String symOblong = kbd.nextLine();
        char symb = symOblong.charAt(0);

        extOblong.setSymbol(symb);
        System.out.println(extOblong.draw());
    }


}
