package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
//    private Collection<Product> products;

    private Map<Product, Integer> products;

    //public void addProduct(Product product) {}

    public void addProduct(Product product, Integer quantity) {
        this.products.put(product, quantity);
        for (int i=0; i< quantity; i++) {
//            products.add(product);
        }
    }

    public BigDecimal getSubtotal() {
        return BigDecimal.ZERO;
    }

    public BigDecimal getTax() {
        return BigDecimal.ZERO;
    }

    public BigDecimal getTotal() {
        return BigDecimal.ZERO;
    }
}
