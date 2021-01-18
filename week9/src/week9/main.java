package week9;

public class main {

    public static void main(String[] args) {
        Customer cust = new Customer("Somsri", "Boonjing");
        Account acct1 = new Account(5000, "Somsri01");
        Account acct2 = new Account(3000, "Somsri02");
        Account acct3 = new Account(5000, "Somsri03");
        Account acct4 = new Account(3000, "Somsri04");
        Account acct5 = new Account(5000, "Somsri05");
        Account acct6 = new Account(3000, "Somsri06");
        cust.addAccount(acct1);
        cust.addAccount(acct2);
        cust.addAccount(acct3);
        cust.addAccount(acct4);
        cust.addAccount(acct5);
        cust.addAccount(acct6);
        cust.addAccount(acct6);
        cust.addAccount(acct6);
        cust.addAccount(acct6);
        cust.addAccount(acct6);
        // ทดลองฝากเงิน ถอนเงินในบัญชีต่างๆ
        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);
        cust.getAccount(2).withdraw(3000);
        cust.getAccount(3).deposit(3000);
        cust.getAccount(4).withdraw(3000);
        // แสดงข้อมูลของลูกค้า เช่น Somsri Boonjing has 2 accounts.
        System.out.println(cust);
        // ทดลองสร้างบัญชีและเพิ่มบัญชีนั้นๆ ให้กับลูกค้า มากกว่า 5 บัญชี
        for (int i = 0; i < cust.getNumOfAccount(); i++) {
            cust.getAccount(i).showAccount();
        }

    }

}
