package JavaArrays;

import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ageAmar, ageAkbar, ageAnthony;
        int heightAmar, heightAkbar, heightAnthony;

        System.out.print("Enter age of Amar: ");
        ageAmar = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        ageAkbar = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        ageAnthony = sc.nextInt();

        System.out.print("Enter height of Amar (in cm): ");
        heightAmar = sc.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        heightAkbar = sc.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        heightAnthony = sc.nextInt();


        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Amar is the Youngest.");
        } else if (ageAkbar < ageAnthony) {
            System.out.println("Akbar is the Youngest.");
        } else {
            System.out.println("Anthony is the Youngest.");
        }

    
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Amar is the Tallest.");
        } else if (heightAkbar > heightAnthony) {
            System.out.println("Akbar is the Tallest.");
        } else {
            System.out.println("Anthony is the Tallest.");
        }

        
    }
}

