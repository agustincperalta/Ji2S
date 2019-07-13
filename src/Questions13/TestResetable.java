package Questions13;

public class TestResetable {

    public static void main(String[] args) {
        // create an Oblong object and BankAccount Object

        Oblong elSueñoPainting = new Oblong(130, 97);
        BankAccount picassoAcct =
                new BankAccount("98745", "Pablo Picasso");

        // Make a deposit into the BankAccount object
        int elSueñoValue = 155_000_000;
        picassoAcct.deposit(elSueñoValue);

        // Print out the actual values of the Oblong Object and the balance of the
        // Account

        System.out.println("El sueño de Pablo picasso");
        System.out.println("Altura: " + elSueñoPainting.getHeight());
        System.out.println("Longitud: " + elSueñoPainting.getLength());
        System.out.println("Valor: " + picassoAcct.getBalance());

        /*call the resetObject method with a lambda expression that sets the
        length and height of the Oblong to 1 */

        resetObject(()->{
            elSueñoPainting.setHeight(1);
            elSueñoPainting.setLength(1);
        });


        /* call the resetObject method with a lambda expression that sets the
        * balance of the BankAccount object to zero. You can't do this
        * directly because there is no setBalance method - but you can withdraw the
        * total amount that is in the account*/

        resetObject(()->{
            picassoAcct.withdraw(picassoAcct.getBalance());
        });
        /* display the length and height of the oblong (wich should now be 1)
        and the balance of the bank account (wich should now be zero)*/
        System.out.println("\nLienzo en Blanco");
        System.out.println("Altura: " + elSueñoPainting.getHeight());
        System.out.println("Longitud: " + elSueñoPainting.getLength());
        System.out.println("Valor: " + picassoAcct.getBalance());
    }

    // write a resetObject method as follows:

    static void resetObject(Resetable objectIn){
        objectIn.reset();
    }
}
