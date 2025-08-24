package JavaArrays;

import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String numStr = Integer.toString(number);
        int n = numStr.length();
        int[] digits = new int[n];
        int[] reverse = new int[n];

        for (int i = 0; i < n; i++) digits[i] = numStr.charAt(i) - '0';
        for (int i = 0; i < n; i++) reverse[i] = digits[n - i - 1];

        System.out.print("Reversed: ");
        for (int d : reverse) System.out.print(d);
        
    }
}
