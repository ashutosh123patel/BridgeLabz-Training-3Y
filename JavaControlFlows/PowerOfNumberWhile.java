package JavaControlFlows;

import java.util.Scanner;

public class PowerOfNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int number = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1;      // initial result
        int counter = 0;     // starting counter

        while (counter < power) {   // loop till counter reaches power
            result *= number;       // multiply result by number
            counter++;              // increment counter
        }

        System.out.println(number + " raised to the power " + power + " = " + result);
        
    }
}
