package JavaMethods;

import java.util.Scanner;

public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int div = sc.nextInt();
        int[] res = findRemainderAndQuotient(num, div);
        System.out.println("Remainder: " + res[0] + " Quotient: " + res[1]);
    }
}
