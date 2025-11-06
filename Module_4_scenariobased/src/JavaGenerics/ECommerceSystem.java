package JavaGenerics;
import java.util.*;

class Product {
    String productName;
    double price;
    double rating;

    public Product(String productName, double price, double rating) {
        this.productName = productName;
        this.price = price;
        this.rating = rating;
    }

    public String toString() {
        return productName + " | Price: " + price + " | Rating: " + rating;
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 85000, 4.5),
            new Product("Smartphone", 45000, 4.8),
            new Product("Tablet", 30000, 4.5)
        );

        products.sort((p1, p2) -> {
            int ratingCompare = Double.compare(p2.rating, p1.rating);
            return ratingCompare != 0 ? ratingCompare : Double.compare(p1.price, p2.price);
        });

        System.out.println("Sorted Products:");
        products.forEach(System.out::println);
    }
}

