package Practice1;

public class BankAccount {
    public static String bankName = "bank of America";
    public String firstname;
    public String lastname;

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String firstname, String lastname) {//contructor
        this.firstname = firstname;
        this.lastname = lastname;
        this.accountHolder = firstname + " " + lastname;

    }


        public String getAccountHolder () {
            return accountHolder;
        }

        public void setAccountHolder (String firstname, String lastname){//initinalz yaptik account holdera burda
       this.accountHolder=firstname+" "+lastname;

        }

        public long getAccountNumber(){
        return accountNumber;
        }
        public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
        }
        public double getBalance(){
        return balance;
        }
        public void setBalance(double balance){
        this.balance=balance;
        }
         public void deposting(int amount){
       // balance+=amount;
             setBalance(balance+amount);

         }
         public void withdrawing(int amount){
        //balance -=amount;
             setBalance(balance-amount);

         }
         public void checkBalance(){
             //System.out.println("Available Balance: "+balance);
             System.out.println("Available Balance :"+getBalance());
         }
         public String toString(){
        return "full name: "+getAccountHolder()+",Balance "+getBalance();
         }






}
