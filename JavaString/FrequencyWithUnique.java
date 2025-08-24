package JavaString;

import java.util.Scanner;

public class FrequencyWithUnique {
    public static char[] uniqueCharacters(String text) {
        int n = 0;
        for (int i = 0; ; i++) {
            try {
                text.charAt(i);
                n++;
            } catch (Exception e) {
                break;
            }
        }
        char[] temp = new char[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                temp[count++] = c;
            }
        }
        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static String[][] characterFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; ; i++) {
            try {
                char c = text.charAt(i);
                freq[c]++;
            } catch (Exception e) {
                break;
            }
        }
        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void display(String[][] arr) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] result = characterFrequency(text);
        display(result);
    }
}
