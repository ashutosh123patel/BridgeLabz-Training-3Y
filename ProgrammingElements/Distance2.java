import java.util.*;
public class Distance2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        double yards = feet / 3.0;         
            double miles = yards / 1760.0;     

        System.out.printf("The distance in yards is %.2f while the distance in miles is %.4f%n",
                          yards, miles);
        
    }
}
