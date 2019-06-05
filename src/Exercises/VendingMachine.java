package Exercises;

import java.util.Scanner;

/*
 * Consider a vending machine that offers the following options:
 * [1] Get gum
 * [2] Get chocolate
 * [3] Get popcorn
 * [4] Get juice
 * [5] Display total sold so far
 * [6] Quit
 *
 * Design and implement a program that continuously allows users to select from these options.
 * When options 1-4 are selected an appropiate message is to be displayed acknowledging their choice.
 * For exampe, when option 3 is selected the following message could be displayed:
 * Here is your popcorn
 * When option 5 is selected, the number of each type of item sold is displayed. For example:
 * 3 item of gum sold
 * 2 item of chocolate sold
 * 6 items of popcorn sold
 * 7 items of juice sold
 * When option 6 is chosen the program terminates. If an option other than 1-6 is entered an appropiate
 * error message should be displayed such as:
 * Error, options 1-6 only!
 * */
enum Elementos {
    // Elementos
    GUM(0), CHOCOLATE(0), POPCORN(0), JUICE(0);
    private int num;

    // Constructor
    Elementos(int num) {
        this.num = num;
    }

    // Getter de num
    public int getNum() {
        return num;
    }

    // Aumenta el valor de num de cada elemento
    public void addNum() {
        num++;
    }
}

public class VendingMachine {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        boolean flag = true;
        do {

            drawMenu();
            int choice = kbd.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Here is your gum\n");
                    Elementos.GUM.addNum();
                    break;
                case 2:
                    System.out.println("Here is your chocolate\n");
                    Elementos.CHOCOLATE.addNum();
                    break;
                case 3:
                    System.out.println("Here is your popcorn\n");
                    Elementos.POPCORN.addNum();
                    break;
                case 4:
                    System.out.println("Here is your juice\n");
                    Elementos.JUICE.addNum();
                    break;
                case 5:
                    showSoldItems();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("there are not a such option!\n");

            }
        } while (flag);


    }

    public static void drawMenu() {
        System.out.println("[1] Get gum");
        System.out.println("[2] Get chocolate");
        System.out.println("[3] Get popcorn");
        System.out.println("[4] Get juice");
        System.out.println("[5] Display total sold so far");
        System.out.println("[6] Quit");
    }

    public static void showSoldItems() {
        for (Elementos e : Elementos.values()) {
            System.out.println(e + " tiene " + e.getNum() + " elementos");
        }
    }
}
