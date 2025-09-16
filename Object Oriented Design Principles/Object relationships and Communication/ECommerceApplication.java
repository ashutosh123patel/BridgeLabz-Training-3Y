import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void getDetails() {
        System.out.println(name + " - $" + price);
    }
}

class Order {
    int orderId;
    ArrayList<Product> products = new ArrayList<>();

    Order(int orderId) {
        this.orderId = orderId;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            p.getDetails();
        }
    }
}

class Customer {
    String name;
    ArrayList<Order> orders = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order order) {
        orders.add(order);
    }

    void showOrders() {
        System.out.println(name + "'s Orders:");
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

public class ECommerceApplication {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John");

        Product laptop = new Product("Laptop", 800);
        Product mouse = new Product("Mouse", 20);

        Order order1 = new Order(101);
        order1.addProduct(laptop);
        order1.addProduct(mouse);

        Order order2 = new Order(102);
        order2.addProduct(mouse);

        customer1.placeOrder(order1);
        customer1.placeOrder(order2);

        customer1.showOrders();
    }
}
