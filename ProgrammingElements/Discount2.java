import java.util.*;
public class Discount2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter fee (INR): ");
        double fee = input.nextDouble();

        System.out.print("Enter discount percent: ");
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discount;

        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n",
                          discount, finalFee);
        
    }
}
