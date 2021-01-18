package week10;

public class main {

    public static void main(String[] args) {
        try {
            CheckingAccount acct1 = new CheckingAccount(1000, "A0001", 500);
            Customer cust = new Customer("Sompong", "Sookjai", acct1);
            cust.getAcct().deposit(500);
            cust.getAcct().withdraw(1800);
            cust.getAcct().withdraw(300);
            cust.getAcct().deposit(1000);
            cust.getAcct().withdraw(200);
            
        } catch (RuntimeException ex) {
            System.out.println("WithdrawException: " + ex);
        }
    }
}
