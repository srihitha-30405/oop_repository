package module;
class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("Balance for " + accountHolder + ": " + balance);
    }

    public void transferFunds(BankAccount target, double amount) {
        try {
            try {
                if (target == null) {
                    throw new NullPointerException("Target account is null");
                }
                if (amount <= 0) {
                    throw new ArithmeticException("Transfer amount must be positive");
                }
                if (balance < amount) {
                    throw new ArithmeticException("Insufficient funds");
                }
                balance -= amount;
                target.balance += amount;
                System.out.println("Transfer successful!");
            } catch (NullPointerException | ArithmeticException e) {
                System.out.println("Error during transfer: " + e.getMessage());
            } finally {
                System.out.println("Transfer attempt completed.");
            }
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 1000);
        BankAccount acc2 = new BankAccount("Bob", 500);

        acc1.checkBalance();
        acc1.transferFunds(acc2, 200);
        acc1.transferFunds(null, 100); // triggers NullPointerException
        acc1.transferFunds(acc2, -50); // triggers ArithmeticException
    }
}
