package JavaMethods;

public class NumberChecker6 {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }
    public static boolean areEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }
    public static boolean isPalindrome(int n) {
        return areEqual(getDigits(n), reverseArray(getDigits(n)));
    }
    public static boolean isDuck(int n) {
        int[] d = getDigits(n);
        for (int i = 1; i < d.length; i++) if (d[i] == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        int num = 121;
        System.out.println("Palindrome? " + isPalindrome(num));
        System.out.println("Duck? " + isDuck(1023));
    }
}
