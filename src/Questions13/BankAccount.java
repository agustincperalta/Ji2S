package Questions13;
/*
* Escrito por Agustín Peralta
* Basandose en la tabla 7.4 del libro "Java in Two Semesters Featuring JavaFX"
*
* */
public class BankAccount {
    String accountNumber;
    String accountName;
    double balance = 0;

    public BankAccount(String accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public boolean withdraw(double amount){
        if (amount > balance){
            return false;
        }
        balance-= amount;
        return true;
    }
}
