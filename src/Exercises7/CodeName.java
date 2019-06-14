package Exercises7;

import java.util.Scanner;

/*
 * Consider a program to
 * enter and confirm a suitable code name for an agent.
 * Declare two string objects, called codeName and confirm and the
 *
 * (a) Prompt to get the user to enter a suitable name into the
 * codeName string
 * (b) Use a while loop to ensure that the string entered is greater
 * than 6 characters in length, if it is not print "INVALID CODENAME"
 * and ask the user to re-enter a code name;
 * (c) Once a valid code name has been entered ask the user to re-enter
 * the code name into the confirm string and then user an if else
 * statement to ensure that the string entered matches the original
 * code name; if it does, print a message "CODE NAME CONFIRMED"
 * otherwise print a message saying "CODE NAME MIS-MATCH";
 * (d) Use the charAt method to ensure that the code name ends with
 * an 'X' character;
 * (e) Finally use the startsWith method to ensure that, as well as
 * being greater than 6 characters in length, the code name entered
 * also starts with the words "Agent"
 * */
public class CodeName {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String codeName, confirm;
        System.out.println("Enter the codename, please");
        codeName = kbd.nextLine();
        while (!codeName.startsWith("Agent") || codeName.length() != 6 || codeName.charAt(codeName.length() - 1) != 'X') {
            System.out.println("INVALID CODENAME");
            System.out.println("Re-enter the codename again, please");
            codeName = kbd.nextLine();
        }
        System.out.println("Confirm the codename, please");
        confirm = kbd.nextLine();
        if (confirm.equals(codeName)) {
            System.out.println("CODE NAME CONFIRMED");
        } else {
            System.out.println("CODE NAME MIS-MATCH");
        }


    }
}
