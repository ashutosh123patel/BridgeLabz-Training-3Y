import java.util.*;
public class INmiles {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter distance in kilometers: ");
            double km = sc.nextDouble();

            double miles = km / 1.6; 

            System.out.printf("The total miles is %.2f mile for the given %.2f km%n", miles, km);
        }
        
    }
    
}
