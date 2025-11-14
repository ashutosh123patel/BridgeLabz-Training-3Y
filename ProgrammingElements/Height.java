import java.util.*;
public class Height {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double cm = input.nextDouble();

        double totalInches = cm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches - (feet * 12);

        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f%n",
                          cm, feet, inches);
        
    }
}
