package UpdatedCode;

public class Products {
    private String productName;
    private double productAmount;
    private boolean productImported;

    public Products(String name, double price, boolean imported) {
        this.productName = name;
        this.productAmount = price;
        this.productImported = imported;
    }

    public String getName() {
        return productName;
    }

    public double getPrice() {
        return productAmount;
    }

    public boolean isImported() {
        return productImported;
    }

    public double calculateSalesTax() {
        if (productName.contains("book") || productName.contains("chocolate") || productName.contains("pills")) {
            return 0;
        }
        return CalculatingTax.SalesTaxCalculation(productAmount);
    }

    public double calculateImportDuty() {
        return productImported ? CalculatingTax.ImportDutyAmountCalculation(productAmount) : 0;
    }

    public double finalPrice() {
        return productAmount + calculateSalesTax() + calculateImportDuty();
    }
}

