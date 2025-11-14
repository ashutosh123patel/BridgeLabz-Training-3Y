package JavaArrays;

import java.util.Scanner;

public class MarksGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                int val;
                do {
                    System.out.print("Enter marks for student " + (i+1) + " subject " + (j+1) + ": ");
                    val = sc.nextInt();
                } while (val < 0);
                marks[i][j] = val;
            }

            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 75) grade[i] = 'B';
            else if (percent[i] >= 50) grade[i] = 'C';
            else grade[i] = 'D';
        }

        for (int i = 0; i < n; i++)
            System.out.println("Physics: " + marks[i][0] + " Chemistry: " + marks[i][1] + " Maths: " + marks[i][2] + " Percentage: " + percent[i] + " Grade: " + grade[i]);

        
    }
}
