public class BankManagementSystem {
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    // Constructor to initialize account details
    public BankManagementSystem(String name, int accNumber, double initialBalance) {
        this.accountHolderName = name;
        this.accountNumber = accNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Creating an instance of BankManagementSystem
        BankManagementSystem account = new BankManagementSystem("John Doe", 123456, 1000.00);

        // Display initial account details
        account.displayAccountDetails();

        // Perform some transactions
        account.deposit(500.00);
        account.withdraw(200.00);
        account.withdraw(1500.00); // Invalid withdrawal

        // Display updated account details
        account.displayAccountDetails();
    }
}