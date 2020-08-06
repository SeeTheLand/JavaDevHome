package simple_junit;

import lombok.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Data
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        calculateTotalCost(line);
    }

    public static void calculateTotalCost(String line) {
        int productACount = 0;
        int productBCount = 0;
        int productCCount = 0;
        int productDCount = 0;

        Product productA = new Product("A", 1.25, 3, 3.00);
        Product productB = new Product("B", 4.25, 0, 0.00);
        Product productC = new Product("C", 1.00, 3, 3.00);
        Product productD = new Product("D", 0.75, 0, 0.00);

        String[] products = line.split("");
        for (int i = 0; i < products.length; i++) {
            switch (products[i]) {
                case "A":   productACount++;
                    break;
                case "B":   productBCount++;
                    break;
                case "C":   productCCount++;
                    break;
                case "D":   productDCount++;
                    break;
            }
        }

        double priceA = (productACount/productA.getDiscount_quantity()*productA.getDiscount_price() + productACount%productA.getDiscount_quantity()*productA.getPrice());
        double priceB = (productBCount*productB.getPrice());
        double priceC = (productCCount/productC.getDiscount_quantity()*productC.getDiscount_price() + productCCount%productC.getDiscount_quantity()*productC.getPrice());
        double priceD = (productDCount*productD.getPrice());

        System.out.println(priceA+priceB+priceC+priceD);

    }

}
