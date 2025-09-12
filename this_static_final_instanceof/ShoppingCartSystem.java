class Product {

    private static double globalDiscount = 0.0;
    private final String productCode;
    private String name;
    private double price;
    private int quantity;

    public Product(String productCode, String name, double price, int quantity) {
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static void setGlobalDiscount(double discount) {
        if (discount >= 0.0 && discount <= 100.0) {
            globalDiscount = discount;
        } else {
            System.out.println("Invalid discount percentage. Enter 0 to 100.");
        }
    }

    public double getPriceAfterDiscount() {
        return price - (price * globalDiscount / 100);
    }

    public void showProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product Code: " + productCode);
            System.out.println("Name: " + name);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + globalDiscount + "%");
            System.out.println("Price after Discount: $" + getPriceAfterDiscount());
        } else {
            System.out.println("Not an instance of Product class.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product.setGlobalDiscount(10.0);
        Product item1 = new Product("PRD101", "Laptop", 1200.00, 5);
        Product item2 = new Product("PRD102", "Smartphone", 800.00, 10);

        item1.showProductDetails();
        System.out.println();
        item2.showProductDetails();
    }
}


