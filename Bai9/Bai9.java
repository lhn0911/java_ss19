package ss19.Bai9;

import java.util.ArrayList;
import java.util.List;

public class Bai9 {
    public static void main(String[] args) {
        ProductProcessor processor = new ProductProcessorImpl();

        List<Product> products = new ArrayList<>();
        products.add(new Product("TiVi", 600));
        products.add(new Product("SmartPhone", 900));
        products.add(new Product("Pc", 350));
        products.add(new Product("Laptop", 500));
        products.add(new Product("Oto", 20000));

        System.out.println("Danh sách sản phẩm:");
        ProductProcessor.printProductList(products);

        if (processor.hasExpensiveProduct(products)) {
            System.out.println("Các sản phẩm có giá trị lớn hơn 100:");
            for (Product product : products) {
                if (product.getPrice() > 100) {
                    System.out.println(product);
                }
            }
        } else {
            System.out.println("Không có sản phẩm đắt tiền.");
        }

        double totalValue = processor.calculateTotalValue(products);
        System.out.println("Tổng giá trị của tất cả sản phẩm: $" + totalValue);
    }
}
