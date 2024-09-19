package UpdatedCode;

public class CalculatingTax {
    private static final double SALES_TAX_RATE = 0.10;
    private static final double IMPORT_DUTY_RATE = 0.05;

    public static double SalesTaxCalculation(double amount) {
        return roundingUpToNearestDecimalPlace(amount * SALES_TAX_RATE);
    }

    public static double ImportDutyAmountCalculation(double amount) {
        return roundingUpToNearestDecimalPlace(amount * IMPORT_DUTY_RATE);
    }

    private static double roundingUpToNearestDecimalPlace(double amount) {
        return Math.ceil(amount * 20) / 20.0;
    }
}

