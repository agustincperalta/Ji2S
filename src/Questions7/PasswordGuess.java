package Questions7;

import jdk.swing.interop.SwingInterOpUtils;

/*
* Consider the following fragment of code that initializes
*  one string constant with a password (“java”) and creates
* a second string to hold the user’s guess for the password.
* The user is then asked to enter their guess:
*
* (a) Write a line of code that uses the EasyScanner class to
* read the guess from the keyboard
*
* (b) Write the code that displays the message "CORRECT PASSWORD"
* if the user entered the corred password and "INCORRECT PASSWORD"
* if not.
*
* */
public class PasswordGuess {
    public static void main(String[] args) {
        final String PASSWORD = "java"; // set password
        String guess; // to hold user's guess
        System.out.println("Enter guess:");
        // (a)
        guess = EasyScanner.nextString();
        // (b)
        if (guess.equals(PASSWORD)){
            System.out.println("CORRECT PASSWORD");
        } else{
            System.out.println("INCORRECT PASSWORD");
        }


    }
}
