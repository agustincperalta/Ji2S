package Exercises;
/*Using a for loop, write a program that displays a "6 times" multiplication
 * table; the output should look like this:
 * 1 x 6 = 6
 * 2 x 6 = 12
 * ...
 *
 * (c) Modify the program further by making use of a while loop to carry out
 * some input validation that ensures that the user enters a number that is
 * never less than 2. If a number less than 2 is entered an error message
 * should be displayed and the user is asked to enter another number
 * (d) Finally, make use of a do... while loop so that the user is
 * asked to enter 'y' or 'n' to indicate if they wish to run the program again.
 * Ideally the program should run again if the user enters 'y' or 'Y'
 * */

import java.util.Scanner;

public class Tables {
    public static Scanner kbd = new Scanner(System.in);
    public static Scanner kbd2 = new Scanner(System.in);

    public static void main(String[] args) {
        String answer;
        do {
            System.out.println("Escribe el número para crear la tabla:");
            int num = kbd.nextInt();
            drawTableValidation(num);
            do {
                System.out.println("Quieres volver a correr el programa?");
                answer = kbd2.nextLine();
                if (!answer.equalsIgnoreCase("n") && !answer.equalsIgnoreCase("y"))
                    System.out.println("valor no valido");
            }while (!answer.equalsIgnoreCase("n") && !answer.equalsIgnoreCase("y"));

            if (answer.equalsIgnoreCase("n")) {
                break;
            }
        } while (answer.equalsIgnoreCase("y"));
    }


    public static void drawTable(int num, int limit) {

        for (int i = 1; i <= limit; i++) {

            System.out.println(i + " x " + num + " = " + (i * num));
        }
    }

    public static void drawTableValidation(int num) {

        while (num < 2) {
            System.out.println("El número debe ser mayor a 2");
            System.out.println("Ingresa el número de nuevo, por favor.");
            num = kbd.nextInt();

        }
        drawTable(num, 12);
    }


}
