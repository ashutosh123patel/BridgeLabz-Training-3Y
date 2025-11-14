package JavaString;

import java.util.Scanner;

public class SplitCompare {
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

    public static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] custom = customSplit(text);
        String[] builtIn = text.split(" ");
        System.out.println("Are both splits equal? " + compareArrays(custom, builtIn));
    }
}

