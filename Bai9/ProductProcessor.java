package ss19.Bai9;

import java.util.List;

public interface ProductProcessor {
    double calculateTotalValue(List<Product> products);

    default boolean hasExpensiveProduct(List<Product> products) {
        for (Product product : products) {
            if (product.getPrice() > 100) {
                return true;
            }
        }
        return false;
    }

    static void printProductList(List<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
