package JavaMethods;

public class LeapYearChecker {
    public static boolean isLeapYear(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }
    public static void main(String[] args) {
        int year = 2024;
        System.out.println(year + " is Leap Year? " + isLeapYear(year));
    }
}
