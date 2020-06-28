package Codiiiin;

public class bankAccount {
    public static String bankname="Bank Of America";
    public String firstname;
    public String lastname;

    private String accountholder;
    private long accountnumber;
    private double balance;

    public bankAccount(String firstname,String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
        this.accountholder=firstname+" "+lastname;
    }//contructor

    public String getAccountholder(){
        return accountholder;
    }
    public void setAccountholder(String firstname,String lastname){
        this.accountholder=firstname+" "+lastname;
    }

    public long getAccountnumber(){
        return accountnumber;
    }
    public void setAccountnumber(long accountnumber){
        this.accountnumber=accountnumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }

public void depositing(int amount){

}
public void withdrawing(int amount){
       // balance-=amount;
    setBalance(balance-amount);
}
public void checkBalance(){
    //System.out.println("available Balance: "+balance);
    System.out.println("available balance: "+getBalance());

}
public String toString(){
        return "full name: "+getAccountholder()+" Balance: "+getBalance();
}





/*
    public String getBankname(){
       return bankname;
   }
   public String getFirstname(){
       return firstname;
   }
   public String getLastname(){
        return lastname;
   }

   public void setBankname(String Bankname){
        this.bankname=bankname;
   }
   public void setFirstname(String firstname){
        this.firstname=firstname;
   }
   public void setLastname(String lastname){
        this.lastname=lastname;
   }

 */


}
