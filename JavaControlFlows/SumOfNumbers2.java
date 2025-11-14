package JavaControlFlows;

import java.util.Scanner;

public class SumOfNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;   
        double n;             

        System.out.println("Enter numbers (0 to stop):");

        n = sc.nextDouble();  

        while (n != 0) {      
            total += n;       
            n = sc.nextDouble(); 
        }

        System.out.println("Total sum = " + total);
        
    }
}
