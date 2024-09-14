package week02;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product("Laptop",740, Product.TaxCalc.KOREA);
        product.calcPriceincludeTax();
        product.displayProductInfo();

        product = new Product("Cup", 172, Product.TaxCalc.FR);
        product.calcPriceincludeTax();
        product.displayProductInfo();
        System.out.println("*".repeat(15));

        Product.TaxCalc taxcalc = product.new TaxCalc();
        System.out.println(taxcalc.calculateTax());
    }
}
