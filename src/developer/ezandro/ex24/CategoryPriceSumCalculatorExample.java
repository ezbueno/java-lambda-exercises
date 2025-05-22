package developer.ezandro.ex24;

import developer.ezandro.shared.model.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CategoryPriceSumCalculatorExample {
    private static final String ELECTRONICS_CATEGORY = "Electronics";
    private static final String FURNITURE_CATEGORY = "Furniture";

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Smartphone", 800.0, ELECTRONICS_CATEGORY),
                new Product("Keyboard", 200.0, ELECTRONICS_CATEGORY),
                new Product("Chair", 300.0, FURNITURE_CATEGORY),
                new Product("Monitor", 900.0, ELECTRONICS_CATEGORY),
                new Product("Desk", 700.0, FURNITURE_CATEGORY)
        );

        Map<String, Double> totalPricesByCategory = calculateTotalPricesByCategory(products);

        totalPricesByCategory.forEach((category, totalPrice) -> {
            System.out.printf("%s: $%.1f%n", category, totalPrice);

        });
    }

    private static Map<String, Double> calculateTotalPricesByCategory(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::category, Collectors.summingDouble(Product::price)));
    }
}