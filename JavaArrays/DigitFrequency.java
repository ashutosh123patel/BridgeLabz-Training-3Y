package JavaArrays;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String numStr = Integer.toString(number);
        int[] freq = new int[10];

        for (char c : numStr.toCharArray()) freq[c - '0']++;

        for (int i = 0; i < 10; i++)
            if (freq[i] > 0)
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");


    }
}
