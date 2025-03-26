package ss19.Bai9;

import java.util.List;

public class ProductProcessorImpl implements ProductProcessor {
    @Override
    public double calculateTotalValue(List<Product> products) {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
