// package scinherit;

class Account{
    // properties 
    private String accountno;
    private String name;
    private String address;
    private String phoneno;
    private String dateofbirth;
    protected long balance;

    // Constructors 
    public Account(String accountno, string name, string newaddress, string phoneno, string dateofbirth){
        this.accountno = accountno;
        this.name = name;
        address = newaddress;
        this.phoneno = phoneno;
        this.dateofbirth = dateofbirth;
        balance = 0;
    }

    public String getaccountno(){return accountno;}
    public String getname(){return name;}
    public String getaddress(){return address;}
    public String getphoneno(){return phoneno;}
    public String getdateofbirth(){return dateofbirth;}

    public void setphoneno(String phoneno){
        this.phoneno = phoneno;
    }
    public void setaddress(String newaddress){
        address = newaddress;
    }
}

class SavingsAccount extends Account{
    public void deposit(long ammount){
        balance = balance + ammount;
    }
    public void withdraw(long ammount){
        balance = balance - ammount;
    }
}

class LoanAccount extends Account{
    public void payEMI(long ammount){
        balance -= ammount;
    }
    public void repay(long ammount){
        if(balance == ammount){
            balance = 0;
        }
    }
}

public class Tut2{
    public static void main(String[] args) {
        
    }
}
























