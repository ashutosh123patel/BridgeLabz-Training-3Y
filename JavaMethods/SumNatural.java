package JavaMethods;

import java.util.Scanner;

public class SumNatural {
    public static int sum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) s += i;
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum = " + sum(n));
    }
}
