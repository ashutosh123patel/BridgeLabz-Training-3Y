package JavaMethods;

import java.util.Scanner;

public class WindChill {
    public static double calculateWindChill(double temp, double windSpeed) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        double windSpeed = sc.nextDouble();
        System.out.println("Wind Chill: " + calculateWindChill(temp, windSpeed));
    }
}

