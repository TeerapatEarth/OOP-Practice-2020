package week9;
import java.util.*;
public class Customer{

    private String firstname;
    private String lastname;
    private ArrayList<Account> acct;
    private int numOfAccount = 0;

    public Customer() {
        firstname = "";
        lastname = "";
        acct = new ArrayList();
    }
    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        acct = new ArrayList();
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public String getLastName() {
        return lastname;
    }
    public String toString() {
        return firstname + lastname + getNumOfAccount();
    }

    public boolean equals(Customer c) {
        return this.firstname.equals(c.firstname) && this.lastname.equals(c.lastname);
    }
    public Account getAccount(int index){
        return acct.get(index);
    }
    public int getNumOfAccount(){
        return acct.size();
    }
    public void addAccount(Account acct){
        this.acct.add(acct);
    }
}
