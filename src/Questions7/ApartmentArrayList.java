package Questions7;

import com.github.javafaker.Faker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;

public class ApartmentArrayList {
    public static void main(String[] args) {
        // Crea un objeto faker para generar los nombres
        Faker faker = new Faker(new Locale("es-MX"));

        ArrayList<Oblong> rooms = new ArrayList<>(3);
        rooms.add(new Oblong(5.2, 4.7));
        rooms.add(new Oblong(5.2, 5.7));
        rooms.add(new Oblong(8.1, 5.0));

        System.out.println(rooms.get(2).calculateArea());

        // Inicia un ArrayList de 100 objetos BankAccount
        ArrayList<BankAccount> cuentas = new ArrayList<>(100);

        // Rellena la arraylist con datos falsos

        for (int i = 0; i < 100; i++) {
            String fakeAcNumber = Integer.toString(faker.number().numberBetween(20000, 12000));
            String fakeName = faker.name().fullName();
            double fakeDeposit = faker.number().randomDouble(2, 20000, 100000);
            double fakeWithdraw = faker.number().randomDouble(2, 200, 100);
            cuentas.add(new BankAccount(fakeAcNumber, fakeName));
            cuentas.get(i).deposit(fakeDeposit);
            cuentas.get(i).withdraw(fakeWithdraw);
        }

        // Imprime los datos de las cuentas
        for (BankAccount c : cuentas) {
            DecimalFormat formatter = new DecimalFormat("#,###,###.##");
            System.out.println(c.getAccountNumber() + " " + c.getAccountName() +
                    " tiene $" + formatter.format(c.getBalance()));
            // System.out.printf("%1.2f", c.getBalance());
            //          System.out.println();
        }
    }
}
