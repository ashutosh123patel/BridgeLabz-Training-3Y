package JavaControlFlows;

import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input! Enter a number between 1 and 99.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
            int counter = 1;
            while (counter < 100) {
                if (counter % number == 0) {
                    System.out.print(counter + " ");
                }
                counter++;
            }
        }
        
    }
}
