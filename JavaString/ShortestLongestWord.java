package JavaString;

import java.util.Scanner;

public class ShortestLongestWord {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[] customSplit(String str) {
        int n = getLength(str);
        int spaceCount = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') spaceCount++;
        }
        String[] words = new String[spaceCount + 1];
        int index = 0;
        String temp = "";
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                words[index++] = temp;
                temp = "";
            } else {
                temp += str.charAt(i);
            }
        }
        words[index] = temp;
        return words;
    }

    public static String[][] withLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static String[] shortestLongest(String[][] arr) {
        int min = Integer.parseInt(arr[0][1]);
        int max = Integer.parseInt(arr[0][1]);
        String minWord = arr[0][0];
        String maxWord = arr[0][0];
        for (String[] row : arr) {
            int len = Integer.parseInt(row[1]);
            if (len < min) {
                min = len;
                minWord = row[0];
            }
            if (len > max) {
                max = len;
                maxWord = row[0];
            }
        }
        return new String[]{minWord, maxWord};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[][] result = withLengths(words);
        String[] minMax = shortestLongest(result);
        System.out.println("Shortest Word: " + minMax[0]);
        System.out.println("Longest Word: " + minMax[1]);
    }
}
