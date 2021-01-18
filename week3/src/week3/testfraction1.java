package week3;
public class testfraction1 {
    public static void main(String[] args){
        Fraction1 f1 = new Fraction1();
        f1.topN = 2;
        f1.btmN = 5;
        Fraction1 f2 = new Fraction1();
        f2.topN = 3;
        f2.btmN = 7;
        System.out.println("before " + f1.toFraction(f1.topN, f1.btmN));
        System.out.println("before " + f1.toFloat(f1.topN, f1.btmN));
        f1.addFraction(f1, f2);
        System.out.println("after " + f1.toFraction(f1.topN, f1.btmN));
        System.out.println("after " + f1.toFloat(f1.topN, f1.btmN));
    }
}
