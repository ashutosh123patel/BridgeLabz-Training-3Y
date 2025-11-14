package JavaMethods;

public class PalindromeChecker {
    public static boolean isPalindrome(int num) {
        int rev = 0, temp = num;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == num;
    }
    public static void main(String[] args) {
        int num = 121;
        System.out.println(num + " is Palindrome? " + isPalindrome(num));
    }
}

