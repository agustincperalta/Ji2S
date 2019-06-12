package Questions6;

import java.util.Scanner;

/*
 * A magic word square is a square in which a word can be formed
 * by reading each row and each column. For example, the following
 * is a 4 by 4 magic word square:
 *
 * P   R   E   Y
 * L   A   V   A
 * O   V   E   R
 * T   E   N   D
 *
 * (a) Declare and initialize a 2D array, magicSquare, to hold
 * the words illustrated above
 * (b) Write a method, displayRow, that accepts the magicSquare
 * array and a row number and displays the word in that row.
 * (c)
 * */
public class MagicWordSquare {

    private static char[][] magicSquare = {
            {'P', 'R', 'E', 'Y'},
            {'L', 'A', 'V', 'A'},
            {'O', 'V', 'E', 'R'},
            {'T', 'E', 'N', 'D'}};

    public static void main(String[] args) {

        displayRow(magicSquare, validRowNumber());
        System.out.println();
        displayColumn(magicSquare, validColumnNumber());
    }

    private static void displayRow(char[][] magicSquare, int row) {
        for (int i = 0; i < magicSquare.length; i++) {
            System.out.print(magicSquare[row - 1][i]);
        }
    }

    private static void displayColumn(char[][] magicSquare, int column) {
        for (int i = 0; i < magicSquare[0].length; i++) {
            System.out.print(magicSquare[i][column - 1]);
        }
    }

    private static int validRowNumber() {

        int number = -1;

        Scanner kbd = new Scanner(System.in);
        do {
            System.out.println("Ingresa número de Fila: ");
            number = kbd.nextInt();
            if (number > magicSquare[0].length || number < 0){
                System.out.println("numero incorrecto");
            }
        } while (number > 4 || number < 0);
        return number;
    }

    private static int validColumnNumber() {

        int number = -1;

        Scanner kbd = new Scanner(System.in);
        do {
            System.out.println("Ingresa número de Columna: ");
            number = kbd.nextInt();
            if (number > magicSquare.length || number < 0){
                System.out.println("numero incorrecto");
            }
        } while (number > 4 || number < 0);
        return number;
    }

}
