package JavaControlFlows;
import java.util.*;
public  class div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("Is the number"+ n+" divisible by 5?"+" yes");

        }
        else{
           System.out.println("Is the number"+ n+" divisible by 5?"+"no");

        }
        
    }
}
