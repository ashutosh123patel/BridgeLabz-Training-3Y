
import java.util.ArrayList;

class Customer {
    String name;
    double accountBalance;

    Customer(String name, double balance) {
        this.name = name;
        this.accountBalance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s balance: $" + accountBalance);
    }
}

class Bank {
    String name;
    ArrayList<Customer> customers = new ArrayList<>();

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println(customer.name + " has opened an account at " + name);
    }

    void showCustomers() {
        System.out.println("Customers of " + name + ":");
        for (Customer c : customers) {
            System.out.println("- " + c.name);
        }
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Bank bank1 = new Bank("City Bank");

        Customer cust1 = new Customer("Alice", 5000);
        Customer cust2 = new Customer("Bob", 10000);

        bank1.openAccount(cust1);
        bank1.openAccount(cust2);

        bank1.showCustomers();

        cust1.viewBalance();
        cust2.viewBalance();
    }
}

