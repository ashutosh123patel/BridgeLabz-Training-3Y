package JavaControlFlows;
import java.util.*;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number:");
        int month = sc.nextInt();

        System.out.println("Enter the date of the month:");
        int date = sc.nextInt();

        boolean isSpring =
            (month == 3 && date >= 20) ||   //  Its for March 20 onwards
            (month == 4) ||                //  Its for Whole April
            (month == 5) ||                //  Its for Whole May
            (month == 6 && date <= 20);     // Its for  Until June 20

        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
    
}