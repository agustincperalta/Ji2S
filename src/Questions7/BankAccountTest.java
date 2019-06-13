package Questions7;
/*
* (a) Write the code that will create two BankAccount objects
* acc1 and acc2. The account number and account name of each should be set at
* the time the object is created
*
* (b) Write the lines of code that will deposit an amount of 200 into acc1 and
* 100 into acc2
*
* (c) Write the lines of code that attempt to withdraw an amount of 150 from acc1
* and displays the message "WITHDRAWAL SUCCESFUL" if the amount was withdrawn
* successfully and "INSUFFICIENT FUNDS" if it was not
*
* (d) Write a line of code that will display the balance of acc1
*
* (e) Write a line of code that will display the balance of acc2
* */
import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        //(a)
        BankAccount acc1 = new BankAccount("21552", "Agustín Peralta");
        BankAccount acc2 = new BankAccount("85234", "José Cruz");
        //(b)
        acc1.deposit(200);
        acc2.deposit(100);
        // (c)
        if (acc1.withdraw(150)){
            System.out.println("RETIRO EXITOSO");
        }else{
            System.out.println("FONDOS INSUFICIENTES");
        }

        // (d)
        System.out.println("Account 1: " + acc1.getBalance());
        // (e)
        System.out.println("Account 2: " + acc2.getBalance());

    }
}
