package JavaMethods;

import java.util.Random;

public class FootballTeamHeights {
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int h : arr) {
            sum += h;
        }
        return sum;
    }

    public static double findMean(int[] arr) {
        return (double)findSum(arr) / arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int h : arr) {
            if (h < min) min = h;
        }
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int h : arr) {
            if (h > max) max = h;
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] heights = new int[11];

    
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        System.out.println("Player Heights:");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        System.out.println("Shortest Player: " + findShortest(heights));
        System.out.println("Tallest Player: " + findTallest(heights));
        System.out.println("Mean Height: " + findMean(heights));
    }
}
