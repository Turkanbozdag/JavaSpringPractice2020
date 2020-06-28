package Codiiiin.Task2;

public class AccountObjects {
    public static void main(String[] args) {
        checkingAccount obj=new checkingAccount();
        obj.accountHolder="Sabah";

        obj.showBalance();
        System.out.println(obj);

        obj.deposit(25000);
        obj.showBalance();

        obj.withdraw(10000);
        obj.showBalance();
    }




}
