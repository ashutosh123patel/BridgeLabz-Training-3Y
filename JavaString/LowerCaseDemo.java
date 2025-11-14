package JavaString;

import java.util.Scanner;

public class LowerCaseDemo {
    public static String toLower(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String manual = toLower(text);
        String builtIn = text.toLowerCase();
        System.out.println("Manual Lowercase: " + manual);
        System.out.println("Built-in Lowercase: " + builtIn);
        System.out.println("Are they same? " + compareStrings(manual, builtIn));
    }
}
