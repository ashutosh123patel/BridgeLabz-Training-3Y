/*package JavaControlFlows;
import java.util.*;
public class SumOfNaturalno2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no you want");
        int n = sc.nextInt();
        if(n>0){
            int sum = n*(n+1)/2;
            System.out.println(sum);
        }
    }
}*/
package JavaControlFlows;
import java.util.*;

public class SumOfNaturalno2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n:");
        int n = sc.nextInt();

        if (n > 0) {
    
            int formulaSum = n * (n + 1) / 2;

            
            int whileSum = 0;
            int i = 1;
            while (i <= n) {
                whileSum += i;
                i++;
            }

        
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + whileSum);

    
            if (formulaSum == whileSum) {
                System.out.println(" Both results are same!");
            } else {
                System.out.println(" Results are different!");
            }
        } else {
            System.out.println("Please enter a positive number.");
        }

        
    }
}

