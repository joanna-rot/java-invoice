package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public abstract class Product {
    private final String name;

    private final BigDecimal price;

    private final BigDecimal taxPercent;

    protected Product(String name, BigDecimal price, BigDecimal tax) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Nazwa nie moze byc nullem");
        }
// or if (name == null || name == "") {
//            throw new IllegalArgumentException("Nazwa nie moze byc nullem i pusta");
//        }
//        if (name.isEmpty()) {
//            throw new IllegalArgumentException("Nazwa nie moze byc pusta");
//        }

        if (price == null || price.compareTo(BigDecimal.ZERO) == -1 ) {
            throw new IllegalArgumentException("Cena nie moze byc nullem i nie moze byc ujemna");
        }

        this.name = name;
        this.price = price;
        this.taxPercent = tax;
    }

    public String getName() {return this.name;}

    public BigDecimal getPrice() { return this.price;}

    public BigDecimal getTaxPercent() { return this.taxPercent;}

    public BigDecimal getPriceWithTax() {
        return this.price.multiply(this.taxPercent).add(this.price);
    }
}
