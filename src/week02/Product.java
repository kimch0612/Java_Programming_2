package week02;

public class Product {
    private String pNAme;
    private double price;
    private double tax = 0.1;
    private int country;

    public Product(String pNAme, double price, int country) {
        this.pNAme = pNAme;
        this.price = price;
        this.country = country;
    }

    public class TaxCalc {
        private double tax;
        public static final int KOREA = 1;
        public static final int USA = 2;
        public static final int FR = 3;

        public double calculateTax() {
            switch (country) {
                case KOREA: return tax = 0.1;
                case USA: return tax = 0.2;
                case FR: return tax = 0.3;
                default: return tax = 0.4;
            }
        }
    }

    public double calculateTaxs() {
        TaxCalc taxCalc = new TaxCalc();
        return this.tax + taxCalc.calculateTax();
    }

    public double calcPriceincludeTax() {
        return this.price + (this.price * calculateTaxs());
    }

    public void displayProductInfo() {
        String nation = (country == 1) ? "KOREA" : (country == 2) ? "USA" : "FRANCE";
        System.out.println("=".repeat(15));
        System.out.println("Product Name : " + pNAme);
        System.out.println("Price : " + price);
        System.out.println("Country : " + nation);
        System.out.println("TotalTax : " + calculateTaxs());
        System.out.println("TotalPrice : " + calcPriceincludeTax());
    }
}
