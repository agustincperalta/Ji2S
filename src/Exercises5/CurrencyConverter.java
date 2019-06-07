package Exercises5;

import java.util.Scanner;

/*
 * (a) Design and implement a program that converts a sum of money to
 * a different currency. The amount of money to be converted, and the
 * exchange rate, are entered by the user. The program should have
 * separate methods for:
 * --> Obtaining the sum of money from the user
 * --> Obtaining the exchange rate from the user
 * --> making the convertion
 * --> displaying the result
 * (b) Adapt the above program so that after the result is displayed the
 * user is asked if he or she wishes to convert another sum of money.
 * The program continues in this way until the user chooses to quit
 *
 * */
public class CurrencyConverter {
    static Scanner kbd = new Scanner(System.in);
    static Scanner kbd2 = new Scanner(System.in);
    static double money;
    static double exchange;

    public static void main(String[] args) {
        String answer;
        // Inicia el ciclo do-while donde al menos realiza una vez el llamado de los tres métodos
        /* PSEUDOCÓDIGO
        haz{
            operación

            haz{
                imprime mensaje
                lee respuesta
                si respuesta no es "si" y no sea "no"
                imprime respuesta invalida
            } mientras respuesta no sea "si" y no sea "no"

            si respuesta es "no"
              termina

        } mientras respuesta sea "si"
*/
        do {
            getMoney();
            getExchange();
            displayConvertion();
            // Inicia el ciclo do-while donde al menos realiza una vez la lectura de la variable answer
            // que indica si se desea continuar (y) detener (n) o si answer tiene una respuesta invalida
            do {
                System.out.println("Otra?(Y/N)"); // Imprime la pregunta
                answer = kbd2.nextLine(); // lee answer por otro stream distinto
                if (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"))
                    // Si answer es distinta a "y" y a "n"...
                    System.out.println("Respuesta invalida"); // Imprime que es una respuesta invalida
            } while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"));
            // Mientras answer sea distinta a "y" y "n" va a seguir preguntando por una respuesta valida

            if (answer.equalsIgnoreCase("n")) {
                System.out.println("Adios!");
                break;
            } // Sí anwer es igual a "n", se acaba el programa

        } while (answer.equalsIgnoreCase("y")); // mientras answer sea y --> hacer otra operación

    }


    // Obtaining the sum of money from the user
    private static void getMoney() {
        System.out.println("Suma a convertir? (A)");
        money = kbd.nextDouble();
    }

    // Obtaining the exchange rate from the user
    private static void getExchange() {
        System.out.println("Tipo de Cambio? (B)");
        exchange = kbd.nextDouble();
    }

    // Making the convertion
    private static double doConvertion() {
        return money * exchange;
    }

    // Displaying the result
    private static void displayConvertion() {
        System.out.print(money + " de A resultan ser ");
        System.out.printf("%1.2f", doConvertion());
        System.out.print(" de B\n");
    }
}
