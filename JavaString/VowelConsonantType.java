package JavaString;

import java.util.Scanner;

public class VowelConsonantType {
    static String getType(char ch) {
        ch = Character.toLowerCase(ch);
        if(ch>='a' && ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] analyze(String str){
        String[][] result = new String[str.length()][2];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = getType(ch);
        }
        return result;
    }

    static void display(String[][] arr){
        System.out.println("Char\tType");
        for(String[] row:arr){
            System.out.println(row[0]+"\t"+row[1]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[][] res = analyze(str);
        display(res);
    }
}

