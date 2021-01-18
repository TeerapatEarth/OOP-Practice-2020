package week3;

import java.util.*;

public class testsudent{ 
    public static void main(String[] args){
       Student show = new Student();
       Scanner sc = new Scanner(System.in);
       System.out.print("Input your midterm score : ");
       double score1 = sc.nextDouble();
       System.out.print("Input tour final score : ");
       double score2 = sc.nextDouble();
       show.showGrade(score1, score2);
    }
}
