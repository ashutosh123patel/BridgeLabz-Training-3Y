package JavaMethods;

import java.util.Arrays;

public class NumberChecker2 {
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        int index = count - 1;
        while (num != 0) {
            digits[index] = num % 10;
            num /= 10;
            index--;
        }
        return digits;
    }
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    
    public static boolean isHarshad(int num) {
        int[] digits = storeDigits(num);
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

   
    public static int[][] digitFrequency(int num) {
        int[] digits = storeDigits(num);
        int[][] freq = new int[10][2]; 

        
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }

        
        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }

    
    public static void main(String[] args) {
        int num = 378; 
        System.out.println("Number: " + num);

       
        System.out.println("Count of Digits: " + countDigits(num));

        
        int[] digits = storeDigits(num);
        System.out.println("Digits Array: " + Arrays.toString(digits));

       
        System.out.println("Sum of Digits: " + sumOfDigits(digits));

        
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(digits));

    
        System.out.println("Is Harshad? " + isHarshad(num));

        
        int[][] freq = digitFrequency(num);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " => " + freq[i][1] + " times");
            }
        }
    }
}

