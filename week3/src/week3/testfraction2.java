package week3;

public class testfraction2 {
    public static void main(String[] args){
        Fraction2 f1 = new Fraction2();
        f1.topN = 1;
        f1.btmN = 3;
        Fraction2 f2 = new Fraction2();
        f2.topN = 4;
        f2.btmN = 16;
        Fraction2 f3 = new Fraction2();
        f3.topN = 5;
        f3.btmN = 15;
        
        System.out.println(f1.toFloat(f1.topN, f1.btmN));
        System.out.println(f2.toFloat(f2.topN, f2.btmN));
        System.out.println(f3.toFloat(f3.topN, f3.btmN));
        
        System.out.println("f1 is equal to f2 >> " + 
        f1.myEquals(f1.toFloat(f1.topN, f1.btmN), f2.toFloat(f2.topN, f2.btmN)));
        
        System.out.println("f1 is equal to f3 >> " + 
        f1.myEquals(f1.toFloat(f1.topN, f1.btmN), f3.toFloat(f3.topN, f3.btmN)));
        
        System.out.println("Before : " + f2.toFraction(f2.topN, f2.btmN));
        f2.LowestTermFrac(f2);
        System.out.println("After : " + f2.toFraction(f2.topN, f2.btmN));
    }
}
