package week3;
public class Fraction1 {
    public int topN;
    public int btmN;
    public String toFraction(int numTop, int numBtm){
        return numTop+"/"+numBtm;
    }
    public String toFloat(double numTop, double numBtm){
        double num = numTop / numBtm;
        return ""+num;
    }
    public void addFraction(Fraction1 f1, Fraction1 f2){
        f1.topN = (f1.topN*f2.btmN)+(f1.btmN*f2.topN);
        f1.btmN = f1.btmN*f2.btmN;      
    }
}
