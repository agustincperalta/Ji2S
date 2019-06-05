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
public class VendingMachine {
enum elementos{
    GUM(0), CHOCOLATE(0), POPCORN(0), JUICE(0);
    int num;
    elementos(num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int choice;
        do {

            drawMenu();
            switch (choice){
                case 1:
                    System.out.println("Here is your gum");
                    break;
                case 2:
                    System.out.println("Here is your chocolate");
                    break;
                case 3:
                    System.out.println("Here is your popcorn");
                    break;
                case 4:
                    System.out.println("Here is your juice");
                    break;
                case 5:
                    showSoldItems();
            }
        } while (true);


    }

    public static void drawMenu() {
        System.out.println("[1] Get gum");
        System.out.println("[2] Get chocolate");
        System.out.println("[3] Get popcorn");
        System.out.println("[4] Get juice");
        System.out.println("[5] Display total sold so far");
        System.out.println("[6] Quit");
    }
    public static void showSoldItems(){

    }
}
