package developer.ezandro.ex21;

import developer.ezandro.shared.model.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductCategoryGrouperExample {
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

        Map<String, List<Product>> productsByCategory = groupProductsByCategory(products);

        productsByCategory.forEach((category, productList) -> {
            System.out.println("\nCategory: " + category);
            productList.forEach(p ->
                    System.out.printf("- %s ($%.2f)%n", p.name(), p.price())
            );
        });
    }

    private static Map<String, List<Product>> groupProductsByCategory(List<Product> products) {
        return products.stream().collect(Collectors.groupingBy(Product::category));
    }
}