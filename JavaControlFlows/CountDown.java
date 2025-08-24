package JavaControlFlows;
import java.util.*;
public class CountDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no for count down :");
        int counter = sc.nextInt();
        while(counter>=1){
            System.out.print(counter+" ");
            counter--;
        }
    }
}
