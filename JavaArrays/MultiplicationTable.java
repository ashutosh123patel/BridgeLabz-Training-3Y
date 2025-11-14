package JavaArrays;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for multiplication table: ");
        int num = sc.nextInt();

        int[] table = new int[10];

        for (int i = 0; i < 10; i++) {
            table[i] = num * (i + 1);
        }

        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(num + " x " + (i + 1) + " = " + table[i]);
        }
    }
}

