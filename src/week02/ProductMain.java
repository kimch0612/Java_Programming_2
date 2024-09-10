package week02;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 100, Product.TaxCalc.KOREA);
        product.calcPriceincludeTax();
        product.displayProductInfo();

        product = new Product("Cup", 100, Product.TaxCalc.FR);
        product.calcPriceincludeTax();
        product.displayProductInfo();
        System.out.println("*".repeat(15));
    }
}
