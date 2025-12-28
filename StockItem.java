package oop.javaedu;

/**
 * Updates:
 * salesTax, priceAfterTax
 * @author kg00k
 */
public class StockItem {
    
    private final String stockNumber;
    private final String name;
    private double price;
    private int totalStock;
    private static int salesTax=22;
    public StockItem(String numIn, String nameIn, double priceIn) {
        stockNumber = numIn;
        name = nameIn;
        price = priceIn;
    }

    public String readAllAttr() {
        String msg = String.format("""
                                   Item name:       %s
                                   Item number:     %s
                                   Price:           $%.2f
                                   Price after tax: $%.2f
                                   Quantity:         %d
                                   """, this.getName(),
                                   this.getStockNumber(),
                                   this.getPrice(),
                                   this.getPriceAfterTax(),
                                   this.getTotalStock()
        );
        return msg;
    }
    
    public void increaseStock(int qty) {
        this.totalStock += qty;
    }
    
    public double totalStockValue() {
        return price *  totalStock;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }   

    public static void setSalesTax(int salesTax) {
        StockItem.salesTax = salesTax;
    }
    
    public static int getSalesTax() {
        return salesTax;
    }
    
    public String getStockNumber() {
        return stockNumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public double getPriceAfterTax() {
        return  getPrice() * (1 + getSalesTax()/100.0);
    }

    public int getTotalStock() {
        return totalStock;
    }
}
