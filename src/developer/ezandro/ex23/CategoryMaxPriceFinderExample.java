package developer.ezandro.ex23;

import developer.ezandro.shared.model.Product;

import java.util.*;
import java.util.stream.Collectors;

public class CategoryMaxPriceFinderExample {
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

        Map<String, Optional<Product>> mostExpensiveByCategory = findMostExpensiveByCategory(products);

        mostExpensiveByCategory.forEach((category, productOpt) -> {
            System.out.printf("%s: ", category);
            productOpt.ifPresentOrElse(
                    product -> System.out.printf("%s - $%.1f%n", product.name(), product.price()),
                    () -> System.out.println("No products found")
            );
        });
    }

    private static Map<String, Optional<Product>> findMostExpensiveByCategory(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::category,
                        Collectors.maxBy(Comparator.comparingDouble(Product::price))));
    }
}