package developer.ezandro.ex14;

import developer.ezandro.shared.model.Product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AffordableElectronicsFilter {
    private static final String ELECTRONICS_CATEGORY = "Electronics";
    private static final String FURNITURE_CATEGORY = "Furniture";
    private static final double MAX_PRICE = 1000.0;

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Smartphone", 800.0, ELECTRONICS_CATEGORY),
                new Product("Keyboard", 200.0, ELECTRONICS_CATEGORY),
                new Product("Chair", 300.0, FURNITURE_CATEGORY),
                new Product("Monitor", 900.0, ELECTRONICS_CATEGORY),
                new Product("Desk", 700.0, FURNITURE_CATEGORY)
        );

        List<Product> sortedProducts = products.stream()
                .filter(product -> ELECTRONICS_CATEGORY.equalsIgnoreCase(product.category())
                        && product.price() < MAX_PRICE)
                .sorted(Comparator.comparingDouble(Product::price))
                .toList();

        sortedProducts.forEach(p ->
                System.out.printf("%s - $%.2f%n", p.name(), p.price()));
    }
}