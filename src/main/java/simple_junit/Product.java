package simple_junit;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {

    private String name;
    private BigDecimal price;
    private int discountQuantity;
    private BigDecimal discountPrice;

    Product (String name, BigDecimal price, int discountQuantity, BigDecimal discountPrice) {
        this.name = name;
        this.price = price;
        this.discountQuantity = discountQuantity;
        this.discountPrice = discountPrice;
    }
}
