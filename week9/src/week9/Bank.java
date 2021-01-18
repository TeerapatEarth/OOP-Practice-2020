package week9;

public class Bank {
    private Account acct[];
    private int numAcct = 0;
    public Bank(){
        acct = new Account[10];
    }
    public void addAccount(Account ac){
        acct[numAcct] = ac;
        numAcct++;
    }
    public Account getAccount(int index){
        return acct[index];
    }
    public int getNumAccount(){
        return numAcct;
    }
}
