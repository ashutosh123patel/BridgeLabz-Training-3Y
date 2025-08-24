package JavaControlFlows;
import java.util.*;
public class Countdown2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number you want for the count down :");
        int counter = sc.nextInt();
        for(int i = counter ; i>=1; i--){
            System.out.print(i+" ");
        }
    }
}
