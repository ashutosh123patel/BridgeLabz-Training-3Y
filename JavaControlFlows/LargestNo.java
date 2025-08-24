package JavaControlFlows;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println("Eneter the number1:");
     int number1 = sc.nextInt();


     System.out.println("Eneter the number2:");
     int number2 = sc.nextInt();

     System.out.println("Eneter the number3:");
     int number3 = sc.nextInt();

     if(number1>number2 && number2 > number3){
        System.out.println(" Is the first number the Largest ?"+ " yes " );
     }

     else if(number2>number3 && number3 > number1){
                System.out.println(" Is the second number the Largest ?"+ " yes " );

     }
     else{
                System.out.println(" Is the third number the Largest ?"+ " yes " );

     
    }
}
}
