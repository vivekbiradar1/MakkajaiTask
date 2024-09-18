package makkajaiDevchallengeTask;

public class Products {
    private String ProductName;
    private double ProductAmount;
    private boolean ProductImported ;

    public Products(String Pname, double Pprice, boolean Pimp) {
        this.ProductName = Pname;
        this.ProductAmount = Pprice;
        this.ProductImported = Pimp;
    }

    public String getName() {
        return ProductName;
    }

    public double getPrice() {
        return ProductAmount;
    }

    public boolean isImported() {
        return ProductImported;
    }
}
