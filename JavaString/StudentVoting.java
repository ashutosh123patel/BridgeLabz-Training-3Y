package JavaString;

import java.util.Scanner;

public class StudentVoting {
    static int[] generateAges(int n){
        int[] ages=new int[n];
        for(int i=0;i<n;i++) ages[i]=(int)(Math.random()*82)+10;
        return ages;
    }

    static String[][] checkVoting(int[] ages){
        String[][] res=new String[ages.length][2];
        for(int i=0;i<ages.length;i++){
            res[i][0]=String.valueOf(ages[i]);
            if(ages[i]<0) res[i][1]="false";
            else if(ages[i]>=18) res[i][1]="true";
            else res[i][1]="false";
        }
        return res;
    }

    static void display(String[][] arr){
        System.out.println("Age\tCanVote");
        for(String[] row:arr){
            System.out.println(row[0]+"\t"+row[1]);
        }
    }

    public static void main(String[] args){
        int[] ages=generateAges(10);
        String[][] res=checkVoting(ages);
        display(res);
    }
}
