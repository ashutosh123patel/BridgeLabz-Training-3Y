package JavaString;

import java.util.Scanner;

public class FirstNonRepeating {
    static char findFirstNonRepeating(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) return text.charAt(i);
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char c = findFirstNonRepeating(text);
        if (c == '\0') System.out.println("No non-repeating character");
        else System.out.println(c);
    }
}

