package Questions8;

import java.util.Scanner;

public class TestProg {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        Scanner kbdString = new Scanner(System.in);
        String tempNumber;
        String tempName;
        double tempPrice;

        System.out.println("Enter the stock number:");
        tempNumber = kbd.nextLine();
        System.out.println("Enter the name of the item:");
        tempName = kbdString.nextLine();
        System.out.println("Enter the price of the item:");
        tempPrice = kbd.nextDouble();

        // Create  a new item of stock using the values that were
        // entered by the user

        StockItem eappliance = new StockItem(tempNumber, tempName, tempPrice);

        // Increase the total number of items in stock by 5
        eappliance.increaseTotalStock(5);

        // Display the stock number
        System.out.println(eappliance.getStockNumber());

        // Display the total price of all items in stock

        System.out.print("Total stock price ") ;
        System.out.printf("%1.2f", eappliance.calculateTotalPrice());
        StockItem.setSalesTax(10);

        
    }


}
