package JavaMethods;

import java.util.Scanner;

public class BMIProgram {
    public static double calculateBMI(double w, double h) {
        double m = h / 100.0;
        return w / (m * m);
    }
    public static String status(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[10][3];
        String[] st = new String[10];
        for (int i = 0; i < 10; i++) {
            arr[i][0] = sc.nextDouble();
            arr[i][1] = sc.nextDouble();
            arr[i][2] = calculateBMI(arr[i][0], arr[i][1]);
            st[i] = status(arr[i][2]);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Weight: " + arr[i][0] + " Height: " + arr[i][1] + " BMI: " + arr[i][2] + " Status: " + st[i]);
        }
    }
}

