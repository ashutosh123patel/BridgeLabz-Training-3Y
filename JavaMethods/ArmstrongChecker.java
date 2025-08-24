package JavaMethods;

public class ArmstrongChecker {
    public static boolean isArmstrong(int num) {
        int temp = num, digits = 0;
        while (temp > 0) { digits++; temp /= 10; }
        temp = num; int sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum == num;
    }
    public static void main(String[] args) {
        int num = 153;
        System.out.println(num + " is Armstrong? " + isArmstrong(num));
    }
}
