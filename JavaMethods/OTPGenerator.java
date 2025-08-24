package JavaMethods;
import java.util.Random;
public class OTPGenerator {
    public static String generateOTP(int len) {
        Random r = new Random();
        String digits = "0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) sb.append(digits.charAt(r.nextInt(10)));
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println("OTP: " + generateOTP(6));
    }
}

