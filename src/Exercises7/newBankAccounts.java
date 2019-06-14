package Exercises7;

import Questions7.BankAccount;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/*
 * Design and implement a program that perorms in the following way:
 *
 * (a) When the program starts, two bank accounts are
 * created, using names and numbers which are written into the code;
 *
 * (b) The user is then asked to enter an account number followed by
 * an amount to deposit in that account
 *
 * (c) The balance of the appropiate account is then updated accordingly
 * - or if an incorrect account number was entered a message to this effect is displayed;
 *
 * (d) The user is then asked if he or she whishes to make more deposits
 *
 * (e) If the user answers does wish to make more deposits, the process continues;
 *
 * (f) If the user does not wish to make more deposits, then details of both accounts
 * (Account number, account name and balance) are displayed
 * */
public class newBankAccounts {
    public static void main(String[] args) {

        Faker f = new Faker(new Locale("es-MX"));
        // (a)

        String nameAcc1 = f.name().fullName();
        String nameAcc2 = f.name().fullName();
        ArrayList<String> accountsNumber = new ArrayList<>(2);
        accountsNumber.add("345233");
        accountsNumber.add("390209");
        BankAccount acc1 = new BankAccount(accountsNumber.get(0), nameAcc1);
        BankAccount acc2 = new BankAccount(accountsNumber.get(1), nameAcc2);
        String ans = " ";
        Scanner kbd2 = new Scanner(System.in);
        do {
            Scanner kbd = new Scanner(System.in);
            System.out.println("Enter the num account to deposit");
            String numacc = kbd.nextLine();
            while (!numacc.equals(accountsNumber.get(0)) && !numacc.equals(accountsNumber.get(1))) {
                System.out.println("That account doesn't exist. Enter again, please");
                numacc = kbd.nextLine();
            }


            System.out.println("Enter the amount of the deposit");
            double amount = kbd.nextDouble();
            while (amount <= 0) {
                System.out.println("Invalid amount, enter again please");
                amount = kbd.nextDouble();
            }
            if (numacc.equals(acc1.getAccountNumber())) acc1.deposit(amount);
            else if (numacc.equals(acc2.getAccountNumber())) acc2.deposit(amount);

            System.out.println("Success");

            System.out.println("Do you want to do another deposit?(Y/N)");
            ans = kbd2.nextLine();
            while (!ans.equalsIgnoreCase("Y") && !ans.equalsIgnoreCase("N")) {
                System.out.println("Invalid input, try again");
                ans = kbd.nextLine();
            }
            if (ans.equalsIgnoreCase("N")) {
                System.out.println("Goodbye!");
                break;
            }

        } while (ans.equalsIgnoreCase("Y"));

        System.out.println("Account: " + acc1.getAccountNumber() + " under the name of: " +
                acc1.getAccountName() + " has $" +acc1.getBalance() );
        System.out.println("Account: " + acc2.getAccountNumber() + " under the name of: " +
                acc2.getAccountName() + " has $" +acc2.getBalance() );

    }


}

