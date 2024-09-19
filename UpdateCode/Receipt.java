package UpdateCode;


import java.util.List;

public class Receipt {
    private List<Products> products;

    public Receipt(List<Products> products) {
        this.products = products;
    }

    public void printReceipt() {
        double totalSalesTax = 0;
        double totalPrice = 0;

        for (Products product : products) {
            double salesTax = product.calculateSalesTax();
            double importDuty = product.calculateImportDuty();
            double finalPrice = product.finalPrice();
            totalSalesTax += salesTax + importDuty;
            totalPrice += finalPrice;

            System.out.printf("%d %s -- %.2f%n", 1, product.getName(), finalPrice);
        }
        
        System.out.printf("Sales Taxes -- %.2f%n", totalSalesTax);
        System.out.printf("Total -- %.2f%n", totalPrice);
    }
}

