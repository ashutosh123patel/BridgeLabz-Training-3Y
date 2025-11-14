package JavaMethods;

import java.util.*;

public class RandomNumbers {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = 1000 + (int)(Math.random() * 9000);
        return arr;
    }
    public static double[] findAverageMinMax(int[] nums) {
        int min = nums[0], max = nums[0], sum = 0;
        for (int n : nums) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        double avg = (double) sum / nums.length;
        return new double[]{avg, min, max};
    }
    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.print("Numbers: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
        double[] res = findAverageMinMax(arr);
        System.out.println("Average: " + res[0] + " Min: " + res[1] + " Max: " + res[2]);
    }
}

