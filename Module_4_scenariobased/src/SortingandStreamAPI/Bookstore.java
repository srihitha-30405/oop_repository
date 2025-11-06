package SortingandStreamAPI;
import java.util.*;

class Book {
    String title;
    double price;
    int publicationYear;

    public Book(String title, double price, int publicationYear) {
        this.title = title;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return title + " | ₹" + price + " | Year: " + publicationYear;
    }
}

public class Bookstore {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Java Basics", 500, 2020),
            new Book("Python Essentials", 500, 2021),
            new Book("C++ Mastery", 650, 2019),
            new Book("Algorithms", 450, 2022)
        );

        books.sort((b1, b2) -> {
            int priceCompare = Double.compare(b2.price, b1.price);
            return priceCompare != 0 ? priceCompare : b1.title.compareTo(b2.title);
        });

        System.out.println("Sorted Books:");
        books.forEach(System.out::println);
    }
}
