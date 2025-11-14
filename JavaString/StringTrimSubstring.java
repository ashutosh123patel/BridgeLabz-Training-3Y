package JavaString;

import java.util.Scanner;

public class StringTrimSubstring {
    static int[] trimIndices(String str){
        int start=0,end=str.length()-1;
        while(start<=end && str.charAt(start)==' ') start++;
        while(end>=start && str.charAt(end)==' ') end--;
        return new int[]{start,end};
    }

    static String substring(String str,int start,int end){
        String res="";
        for(int i=start;i<=end;i++) res+=str.charAt(i);
        return res;
    }

    static boolean compare(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[] pos=trimIndices(str);
        String customTrim=substring(str,pos[0],pos[1]);
        String builtInTrim=str.trim();
        System.out.println("Custom Trim: '"+customTrim+"'");
        System.out.println("Built-in Trim: '"+builtInTrim+"'");
        System.out.println("Are Equal: "+compare(customTrim,builtInTrim));
    }
}
