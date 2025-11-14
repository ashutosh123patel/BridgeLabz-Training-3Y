package JavaMethods;

import java.util.Scanner;

public class Quadratic {
    public static double[] roots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{r1, r2};
        } else if (delta == 0) {
            double r = -b / (2 * a);
            return new double[]{r};
        } else return new double[]{};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double[] r = roots(a, b, c);
        if (r.length == 0) System.out.println("No Real Roots");
        else for (double x : r) System.out.println("Root: " + x);
    }
}

