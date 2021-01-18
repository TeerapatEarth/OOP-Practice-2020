package week3;
public class Student {
    public String name;
    public double MidtermScore;
    public double FinalScore;
    public static void showGrade(double num1, double num2){
        double score = (num1*0.4) + (num2*0.4) + 20;
        if (100 >= score && score >= 80 ){
            System.out.println("Your grade is A");
        }
        else if (80 > score && score >= 70){
            System.out.println("Your grade is B");
        }
        else if (70 > score && score >= 60){
            System.out.println("Your grade is C");
        }
        else if (60 > score && score >= 50){
            System.out.println("Your grade is D");
        }
        else if (score < 50){
            System.out.println("Your grade is F");
        }
    }
}
