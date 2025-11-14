package JavaMethods;

public class NumberChecker {

    
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }


    public static int[] getDigits(int num) {
        int len = countDigits(num);
        int[] digits = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    
    public static boolean isDuckNumber(int num) {
        int[] digits = getDigits(num);
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int num) {
        int[] digits = getDigits(num);
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == num;
    }


    public static int[] largestTwo(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }


    public static int[] smallestTwo(int[] digits) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        int number = 153;
        int[] digits = getDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Count Digits: " + countDigits(number));
        System.out.println("Duck Number? " + isDuckNumber(number));
        System.out.println("Armstrong? " + isArmstrong(number));

        int[] largest = largestTwo(digits);
        int[] smallest = smallestTwo(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}

