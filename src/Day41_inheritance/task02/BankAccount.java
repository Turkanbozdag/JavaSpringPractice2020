package Day41_inheritance.task02;

public class BankAccount {
    public long accountNumber;
    public String accountHolder;
    public double balance;

    public void deposit(int amount){
        balance+=amount;
    }
    public void showBalance(){
        System.out.println("available balance:"+balance);
    }
    public String toString(){
        return "name: "+accountHolder+"balance"+balance;

    }


}
