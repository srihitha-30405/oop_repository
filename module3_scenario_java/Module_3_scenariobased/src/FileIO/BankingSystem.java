package FileIO;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BankingSystem {
    public static void appendTransactions(ArrayList<String> transactions) {
        String fileName = "transactions.log";

        try (FileWriter writer = new FileWriter(fileName, true)) { // true enables appending
            for (String transaction : transactions) {
                writer.write(transaction + "\n");
            }
            System.out.println("Transactions successfully appended to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> transactions = new ArrayList<>();
        transactions.add("2025-10-13 09:00: Withdraw $300");
        transactions.add("2025-10-13 10:30: Deposit $500");
        transactions.add("2025-10-13 11:15: Transfer $200 to Account #12345");

        appendTransactions(transactions);
    }
}

