

public class AccountSystem {
    private static String bankTitle = "National Bank of India";
    private static int totalAccountsCreated = 0;
    private final String accountID;
    private String holderName;
    private double currentBalance;
    public AccountSystem(String holderName, String accountID, double initialBalance) {
        this.holderName = holderName;
        this.accountID = accountID;   
        this.currentBalance = initialBalance;
        totalAccountsCreated++;
    }

    public static void showTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccountsCreated);
    }

    public void showAccountInfo() {
        if (this instanceof AccountSystem) {
            System.out.println("Bank Title: " + bankTitle);
            System.out.println("Account Holder: " + holderName);
            System.out.println("Account ID: " + accountID);
            System.out.println("Balance: $" + currentBalance);
        } else {
            System.out.println("Not a valid account object.");
        }
    }

    
    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void addFunds(double amount) {
        if (amount > 0) {
            currentBalance += amount;
            System.out.println("Added: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void removeFunds(double amount) {
        if (amount > 0 && amount <= currentBalance) {
            currentBalance -= amount;
            System.out.println("Removed: $" + amount);
        } else {
            System.err.println("Insufficient balance or invalid amount.");
        }
    }

    public static void main(String[] args) {
        AccountSystem acc1 = new AccountSystem("Alice Roy", "ID1001", 1200.00);
        AccountSystem acc2 = new AccountSystem("Bob Smith", "ID1002", 700.00);

        System.out.println("\nAccount 1 Details:");
        acc1.showAccountInfo();

        System.out.println("\nAccount 2 Details:");
        acc2.showAccountInfo();

        
        AccountSystem.showTotalAccounts();

        System.out.println("\nPerforming transactions on Account 1:");
        acc1.addFunds(300);
        acc1.removeFunds(100);
        acc1.showAccountInfo();

        acc2.addFunds(150);
        acc2.removeFunds(900);  
        acc2.showAccountInfo();
    }
}
