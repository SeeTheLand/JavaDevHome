package simple_junit;

import lombok.Data;

@Data
public class Product {

    private String name;
    private double price;
    private int discount_quantity;
    private double discount_price;

    Product (String name, double price, int discount_quantity, double discount_price) {
        this.name = name;
        this.price = price;
        this.discount_quantity = discount_quantity;
        this.discount_price = discount_price;
    }
}
