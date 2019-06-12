package Questions6;
/*
 * Consider an application that records the punctuality of trains
 * on a certain route
 *
 * (a) Declare a 2D array, late, to hold the number of times a train
 * on this route was late for each day of the week, and for each week of the
 * year
 * (b) Write a fragment of code that adds up the total number of days in the
 * year when a train was late more than twice in a given day
 * */

import java.util.Random;
import java.util.Scanner;

public class Trains {
    public static void main(String[] args) {
        int[][] late = new int[52][7];
        generaAleatoreo(late);
        // imprimeArray(late);
        Scanner kbd = new Scanner(System.in);
        System.out.println("Dime el día (1-7):");
        int dia = kbd.nextInt();
        while (dia < 0 || dia > 7){
            System.out.println("Número no valido");
            System.out.println("Dime el día (1-7):");
            dia = kbd.nextInt();
        }
        String diaSemana = convierteDia(dia);
        imprimeArray(late);
        System.out.println(cuentaMasDeDos(late, dia) + " " + diaSemana +
                " llego el tren tarde más de dos veces en el año");

    }

    private static void generaAleatoreo(int[][] arrayin) {
        Random c = new Random();

        for (int i = 1; i <= arrayin.length; i++) {
            for (int j = 1; j <= arrayin[0].length; j++)
                arrayin[i - 1][j - 1] = (int) (c.nextDouble() * 3);
        }
    }

    private static void imprimeArray(int[][] arrayin) {
        for (int i = 1; i <= arrayin.length; i++) {
            System.out.println();
            for (int j = 1; j <= arrayin[0].length; j++) {
                System.out.print(arrayin[i - 1][j - 1]);
            }
        }
        System.out.println();
    }

    private static int cuentaMasDeDos(int[][] arrayin, int dia) {
        int cuenta = 0;
        for (int j = 1; j <= arrayin.length; j++) {
            if (arrayin[j - 1][dia - 1] >= 2) {
                cuenta++;
            }
        }
        return cuenta;
    }

    private static String convierteDia(int dia) {

        switch (dia) {
            case 1:
                return "Domingos";
            case 2:
                return "Lunes";
            case 3:
                return "Martes";
            case 4:
                return "Miercoles";
            case 5:
                return "Jueves";
            case 6:
                return "Viernes";
            case 7:
                return "Sabados";
            default:
                return "none";

        }


    }


}
