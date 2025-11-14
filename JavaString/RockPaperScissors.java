package JavaString;

import java.util.Scanner;

public class RockPaperScissors {
    static String getComputerChoice(){
        int n=(int)(Math.random()*3);
        if(n==0) return "rock";
        if(n==1) return "paper";
        return "scissors";
    }

    static String winner(String user,String comp){
        if(user.equals(comp)) return "Draw";
        if(user.equals("rock") && comp.equals("scissors")) return "User";
        if(user.equals("scissors") && comp.equals("paper")) return "User";
        if(user.equals("paper") && comp.equals("rock")) return "User";
        return "Computer";
    }

    static void displayStats(int userWins,int compWins,int total){
        double userPercent=(userWins*100.0)/total;
        double compPercent=(compWins*100.0)/total;
        System.out.println("User Wins: "+userWins+" ("+userPercent+"%)");
        System.out.println("Computer Wins: "+compWins+" ("+compPercent+"%)");
        System.out.println("Draws: "+(total-userWins-compWins));
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int games=sc.nextInt();
        int userWins=0,compWins=0;
        for(int i=0;i<games;i++){
            String user=sc.next().toLowerCase();
            String comp=getComputerChoice();
            String res=winner(user,comp);
            System.out.println("User: "+user+" Computer: "+comp+" Winner: "+res);
            if(res.equals("User")) userWins++;
            else if(res.equals("Computer")) compWins++;
        }
        displayStats(userWins,compWins,games);
    }
}
