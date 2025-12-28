
package oop.javaedu;

import java.util.Scanner;

/**
 *
 * @author kg00k
 */
public class StockItemTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String tempNumber, tempName;
        double tempPrice;
        
        System.out.print("Enter the stock number: ");
        tempNumber = sr.nextLine();
        System.out.print("Enter the stock name: ");
        tempName = sr.nextLine();
        System.out.print("Enter the price of an item: ");
        tempPrice = sr.nextDouble();
        
        StockItem s1 = new StockItem(tempNumber,tempName,tempPrice);
        s1.increaseStock(5);
        System.out.println(s1.readAllAttr());
        System.out.println(String.format(
                "Total value of all %s items: $%.2f",
                s1.getName(),
                s1.totalStockValue())     
        );
        
    }
    
}
