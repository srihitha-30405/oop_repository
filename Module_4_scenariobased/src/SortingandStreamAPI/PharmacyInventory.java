package SortingandStreamAPI;
import java.util.*;

class Medicine {
    String name;
    double price;
    int expiryYear;

    public Medicine(String name, double price, int expiryYear) {
        this.name = name;
        this.price = price;
        this.expiryYear = expiryYear;
    }

    public String toString() {
        return name + " | ₹" + price + " | Expiry: " + expiryYear;
    }
}

public class PharmacyInventory {
    public static void main(String[] args) {
        List<Medicine> inventory = Arrays.asList(
            new Medicine("Paracetamol", 25.0, 2026),
            new Medicine("Ibuprofen", 25.0, 2025),
            new Medicine("Amoxicillin", 40.0, 2027),
            new Medicine("Cetirizine", 15.0, 2024)
        );

        inventory.sort((m1, m2) -> {
            int priceCompare = Double.compare(m1.price, m2.price);
            return priceCompare != 0 ? priceCompare : Integer.compare(m2.expiryYear, m1.expiryYear);
        });

        System.out.println("Sorted Medicines:");
        inventory.forEach(System.out::println);
    }
}
