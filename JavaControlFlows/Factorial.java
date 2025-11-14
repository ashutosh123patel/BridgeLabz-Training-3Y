package JavaControlFlows;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no you want: ");
        int n = sc.nextInt();
        int factorial=1;
        int i =1;
        while(i<=n){
            factorial = factorial*i;
            i++;
        }
        System.out.println("The factorial of " + n + " is " + factorial);
    }
}
