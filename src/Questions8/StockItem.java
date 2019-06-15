package Questions8;

public class StockItem {

    private String stockNumber;
    private String name;
    private double price;
    private int totalStock = 0;
    private static double salesTax = -1;

    public StockItem(String stockNumber, String name, double price) {
        this.stockNumber = stockNumber;
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void increaseTotalStock(int totalStock) {
        this.totalStock += totalStock;
    }

    public String getStockNumber(){
        return stockNumber;
    }

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double calculateTotalPrice(){
        return price * totalStock;
    }

    public int getTotalStock() {
        return totalStock;
    }

    public static void setSalesTax(double tax){
        salesTax = tax;
    }

}
