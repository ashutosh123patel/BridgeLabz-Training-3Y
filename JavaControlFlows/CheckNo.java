package JavaControlFlows;
import java.util.*;
public class CheckNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want: ");
        int n =sc.nextInt();
        if(n>0){
            System.out.println("Positive no");
        }
        else if ( n<0){
                        System.out.println("negative no");

        }
        else {
                        System.out.println("zero");

        }
    }
}
