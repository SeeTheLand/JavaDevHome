package testing_junit_mockito;

import java.sql.*;

public class Product {
    private String name;
    private double price;
    private int discount_quantity;
    private double discount_price;

    Product(String name) throws SQLException {
        String query = "SELECT price FROM product_store.public.list_of_products";
        RetrieveDataFromDatabase connectionToDatabase = new RetrieveDataFromDatabase();
        ResultSet rs = connectionToDatabase.getData(query);
        while (rs.next()) {
            System.out.print(rs.getDouble(1));
        }

    }
}
