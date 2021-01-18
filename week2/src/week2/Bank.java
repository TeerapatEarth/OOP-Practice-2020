package week2;
import java.util.*;
public class Bank {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner sctype = new Scanner(System.in);
    System.out.print("Input your money : ");
    double money = sc.nextDouble();
    System.out.print("Input your account type : "); 
    String type = sctype.nextLine();
    if (type.equals("A")){
        money += money*0.015;
    }
    else if (type.equals("B")){
        money += money*0.02;
    }
    else if (type.equals("C")){
        money += money*0.015;
    }
    else if (type.equals("X")){
        money += money*0.05;
    }
    System.out.println("Your total money in one year = "+money);
    }
    
}
