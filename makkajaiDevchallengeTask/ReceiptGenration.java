package makkajaiDevchallengeTask;

//ReceiptPrinter.java
import java.util.ArrayList;
import java.util.List;

public class ReceiptGenration {

 public static void printReceipt(List<Products> Product) {
     double totalSalesTax = 0;
     double totalImportDuty = 0;
     double totalPrice = 0;

     List<String> billLines = new ArrayList<>();

     for (Products val : Product) {
         double itemPrice = val.getPrice();
         double salesTax = 0;
         double importDuty = 0;

         if (!val.getName().contains("book") && !val.getName().contains("chocolate") && !val.getName().contains("pills")) {
             salesTax = CalculatingTax.SalesTaxCalculation(itemPrice);
         }
         if (val.isImported()) {
             importDuty = CalculatingTax.ImportDutyAmountCalculation(itemPrice);
         }

         double finalPrice = itemPrice + salesTax + importDuty;
         totalSalesTax += salesTax;
         totalImportDuty += importDuty;
         totalPrice += finalPrice;

         billLines.add(String.format("%d %s -- %.2f", 1, val.getName(), finalPrice));
     }

     billLines.add(String.format("Sales Taxes -- %.2f", totalSalesTax + totalImportDuty));
     billLines.add(String.format("Total -- %.2f", totalPrice));

     for (String line : billLines) {
         System.out.println(line);
     }
 }
}
