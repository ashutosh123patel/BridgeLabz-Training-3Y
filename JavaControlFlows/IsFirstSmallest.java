package JavaControlFlows;
import java.util.*;
public class IsFirstSmallest {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println("Eneter the number1:");
     int number1 = sc.nextInt();

    // Scanner sc = new Scanner(System.in);
     System.out.println("Eneter the number2:");
     int number2 = sc.nextInt();

     //Scanner sc =new Scanner(System.in);
     System.out.println("Eneter the number3:");
     int number3 = sc.nextInt();

     if(number1<number2 && number2<number3){
        System.out.println(" Is the first number the smallest?"+ " yes " );
     }
     else{
        System.out.println(" Is the first number the smallest?"+ " No " );
     }



    }
}
