package week3;
public class Fraction2 {
    public int topN;
    public int btmN;
    private boolean check;
    public String toFraction(int numTop, int numBtm){
        return numTop+"/"+numBtm;
    }
    public String toFloat(double numTop, double numBtm){
        double num = numTop / numBtm;
        return ""+num;
    }
    public boolean myEquals(String num1, String num2){;
        if (num1.equals(num2)){
            return check = true;
        }
        else{
            return check;
    
        }
    }
    public void LowestTermFrac(Fraction2 f2){
        f2.topN = f2.topN/4;
        f2.btmN = f2.btmN/4;
    }
}
