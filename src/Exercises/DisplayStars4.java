package Exercises;
// Adapt it so that the user is allowed to enter a size only between 2 and 20
// Adapt the program further so that the user can choose whether of not to have another go

import java.util.Scanner;

public class DisplayStars4 {
    public static void main(String[] args) {
        int num; // to hold the user response
        Scanner kbd = new Scanner(System.in);
        Scanner kbd2 = new Scanner(System.in);
        String answer;
        //prompt and get user response
        do {
            do {
                System.out.println("Size of the square?");
                num = kbd.nextInt();
                if (num <= 2 || num >= 20) {
                    System.out.println("Invalid input, try again");
                }

            } while (num <= 2 || num >= 20);

            for (int i = 1; i <= num; i++) { // number of rows fixed to num
                for (int j = 1; j <= num; j++) {
                    System.out.print("* ");
                }
                System.out.println();

            }
            do {
                System.out.println("Do you want another try? (Y/N)");
                answer = kbd2.nextLine();
                if (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                    System.out.println("Invalid answer, try again.");
                }
            }while(!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"));

            if (answer.equalsIgnoreCase("n")) {
                System.out.println("Ok, gookbye!");
                break;
            }
        } while (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n"));
        // display square

    }
}
