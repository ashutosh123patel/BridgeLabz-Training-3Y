import java.util.*;
public class Distances {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        double yards = feet / 3.0;    
        double miles = feet / 5280.0;    

        System.out.printf("The distance is %.2f yards and %.4f miles for the given %.2f feet%n",
                          yards, miles, feet);
        
    }
}
