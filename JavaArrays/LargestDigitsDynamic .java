package JavaArrays;

import java.util.Scanner;

public class LargestDigitsDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxDigit = 10, index = 0;
        int[] digits = new int[maxDigit];

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) temp[i] = digits[i];
                digits = temp;
            }
            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = -1, second = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + second);
        
    }
}

