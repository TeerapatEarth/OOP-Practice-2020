package week10;

public class CheckingAccount extends Account{
    private double credit;
    public CheckingAccount(){}
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if(credit > 0){
            this.credit += credit;
        }
        else{
            System.out.println("Input number must be a positive integer");
        }
    }
    public double getCredit(){
        return credit;
    }
    public void withdraw(double a) throws WithdrawException{
        double moneyleft = super.balance - a;
        if(moneyleft >= 0){
            super.balance -= a;
            System.out.println(a+" baht is withdrawn from "+super.name+" and your credit balance is "+this.credit+".");
        }
        else if (moneyleft < 0 && moneyleft + credit >= 0){
            super.balance = 0;
            credit -= (0 - moneyleft);
            System.out.println(a+" baht is withdrawn from "+super.name+" and your credit balance is "+this.credit+".");
        }
        else{
            throw new WithdrawException("Account "+ name + "has not enough money.");
        }
    }
    public void withdraw(int a){
        this.withdraw(a);
    }
    public String toString(){
        if(super.name != null){
            return "The "+super.name+" account has "+super.balance+" baht and "+this.credit+" credits.";
        }
        else{
            return "The account has "+super.balance+" baht and "+this.credit+" credits.";
        }
    }
}
