package week8;

public class Customer{

    private String firstname;
    private String lastname;
    private CheckingAccount acct;

    public Customer() {
        this("", "", null);
    }
    public Customer(String firstname, String lastname) {
        this(firstname, lastname, null);
    }

    public Customer(String firstname, String lastname, CheckingAccount acct) {
        setFirstName(firstname);
        setLastName(lastname);
        setAcct(acct);
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

    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
    }

    public CheckingAccount getAcct() {
        return acct;
    }

    public String toString() {
        if (acct == null && firstname != "" && lastname != "") {
            return getFirstName() + " " + getLastName() + " doesn't have account.";
        }
        else if (firstname == "" && lastname == ""){
            return "doesn't have account.";
        }
        else{
            return "The "+getFirstName()+" account has "+acct.balance+" baht and "+acct.getCredit()+" credits.";
        }
    }

    public boolean equals(Customer c) {
        return this.firstname.equals(c.firstname) && this.lastname.equals(c.lastname);
    }
}
