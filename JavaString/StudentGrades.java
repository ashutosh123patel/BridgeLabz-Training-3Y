package JavaString;

public class StudentGrades {
    static int[][] generateScores(int n){
        int[][] scores=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                scores[i][j]=(int)(Math.random()*41)+60;
            }
        }
        return scores;
    }

    static double[][] calculateStats(int[][] scores){
        double[][] stats=new double[scores.length][3];
        for(int i=0;i<scores.length;i++){
            int total=scores[i][0]+scores[i][1]+scores[i][2];
            double avg=total/3.0;
            double percent=(total/300.0)*100;
            stats[i][0]=total;
            stats[i][1]=Math.round(avg*100.0)/100.0;
            stats[i][2]=Math.round(percent*100.0)/100.0;
        }
        return stats;
    }

    static String[] calculateGrades(double[][] stats){
        String[] grades=new String[stats.length];
        for(int i=0;i<stats.length;i++){
            double p=stats[i][2];
            if(p>=90) grades[i]="A";
            else if(p>=80) grades[i]="B";
            else if(p>=70) grades[i]="C";
            else if(p>=60) grades[i]="D";
            else grades[i]="F";
        }
        return grades;
    }

    static void display(int[][] scores,double[][] stats,String[] grades){
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent\tGrade");
        for(int i=0;i<scores.length;i++){
            System.out.println(scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+"\t"+(int)stats[i][0]+"\t"+stats[i][1]+"\t"+stats[i][2]+"\t"+grades[i]);
        }
    }

    public static void main(String[] args){
        int[][] scores=generateScores(5);
        double[][] stats=calculateStats(scores);
        String[] grades=calculateGrades(stats);
        display(scores,stats,grades);
    }
}

