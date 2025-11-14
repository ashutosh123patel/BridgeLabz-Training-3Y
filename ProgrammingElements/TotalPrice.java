import java.util.*;
public class TotalPrice {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        long n = sc.nextLong();

        long handshakes = (n * (n - 1)) / 2;

        System.out.printf("The maximum number of handshakes is %d among %d students%n",
                          handshakes, n);
        
    }
}
