package JavaArrays;

import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] phy = new int[n], chem = new int[n], math = new int[n];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Physics marks: ");
            phy[i] = sc.nextInt();
            System.out.print("Chemistry marks: ");
            chem[i] = sc.nextInt();
            System.out.print("Maths marks: ");
            math[i] = sc.nextInt();

            percent[i] = (phy[i] + chem[i] + math[i]) / 3.0;
            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 75) grade[i] = 'B';
            else if (percent[i] >= 50) grade[i] = 'C';
            else grade[i] = 'D';
        }

        for (int i = 0; i < n; i++)
            System.out.println("Physics: " + phy[i] + " Chemistry: " + chem[i] + " Maths: " + math[i] + " Percentage: " + percent[i] + " Grade: " + grade[i]);

        
    }
}
