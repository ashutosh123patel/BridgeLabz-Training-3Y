package JavaMethods;

import java.util.Scanner;

public class Friends {
    public static int youngest(int[] ages) {
        int min = 0;
        for (int i = 1; i < ages.length; i++) if (ages[i] < ages[min]) min = i;
        return min;
    }
    public static int tallest(int[] heights) {
        int max = 0;
        for (int i = 1; i < heights.length; i++) if (heights[i] > heights[max]) max = i;
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        for (int i = 0; i < 3; i++) ages[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) heights[i] = sc.nextInt();
        String[] names = {"Amar", "Akbar", "Anthony"};
        System.out.println("Youngest: " + names[youngest(ages)]);
        System.out.println("Tallest: " + names[tallest(heights)]);
    }
}
