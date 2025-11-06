package Serialization;
import java.io.*;
import java.util.*;

class Product implements Serializable {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "ProductID: " + productId + ", Name: " + name + ", Price: " + price;
    }
}

public class ProductSerializer {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product(201, "Laptop", 85000),
            new Product(202, "Smartphone", 45000),
            new Product(203, "Headphones", 3000)
        );

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("inventory.dat"))) {
            oos.writeObject(products);
            System.out.println("Product list serialized to inventory.dat");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }
    }
}
