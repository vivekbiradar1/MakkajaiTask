package makkajaiDevchallengeTask;

public class CalculatingTax {

    private static final double SALES_TAX_RATE = 0.10;
    private static final double IMPORT_DUTY_RATE = 0.05;

    public static double SalesTaxCalculation(double amount)     {
        return roundingUpToNearestdecimalplace(amount * SALES_TAX_RATE);
    }

    public static double ImportDutyAmountCalculation(double amount) {
        return roundingUpToNearestdecimalplace(amount * IMPORT_DUTY_RATE);
    }

    private static double roundingUpToNearestdecimalplace(double amount) {
        return Math.ceil(amount * 20) / 20.0;
    }
    
    
    
}
