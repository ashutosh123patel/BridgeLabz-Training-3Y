package JavaArrays;

import java.util.Scanner;

public class PosNegEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            if (num == 0) {
                System.out.println(num + " is Zero");
            } else {
                if (num > 0) {
                    System.out.print(num + " is Positive ");
                } else {
                    System.out.print(num + " is Negative ");
                }

                if (num % 2 == 0) {
                    System.out.println("and Even");
                } else {
                    System.out.println("and Odd");
                }
            }
        }
    }
}
