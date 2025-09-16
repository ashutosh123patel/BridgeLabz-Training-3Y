import java.util.*;

class Product {
    private String name;
    private double price;
    private double qty;

    public Product(String name, double price, double qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getQty() {
        return qty;
    }

    public double totalPrice() {
        return price * qty;
    }
}

class Customer {
    private String name;
    private List<Product> items;

    public Customer(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(Product p) {
        items.add(p);
    }

    public List<Product> getItems() {
        return items;
    }
}

class Bill {
    public double calculate(Customer c) {
        double total = 0;
        for (Product p : c.getItems()) {
            total += p.totalPrice();
        }
        return total;
    }
}

public class GroceryShop {
    public static void main(String[] args) {
        Customer nakul = new Customer("Nakul");
        nakul.add(new Product("Apples", 30.0, 2.0));
        nakul.add(new Product("Milk", 80.0, 1.0));

        Bill billGen = new Bill();
        double total = billGen.calculate(nakul);

        System.out.println("Customer: " + nakul.getName());
        for (Product p : nakul.getItems()) {
            System.out.println(p.getName() + " -> " + p.getQty() + " units @ Rs." 
                + p.getPrice() + " each = Rs." + p.totalPrice());
        }
        System.out.println("Total Bill: Rs." + total);
    }
}
