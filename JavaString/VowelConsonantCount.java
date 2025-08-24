package JavaString;

import java.util.Scanner;

public class VowelConsonantCount {
    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }

    static int[] countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                if(isVowel(ch)) vowels++;
                else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] result = countVowelsConsonants(str);
        System.out.println("Vowels: " + result[0] + " Consonants: " + result[1]);
    }
}

