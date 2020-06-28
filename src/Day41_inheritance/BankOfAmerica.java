package Day41_inheritance;

public class BankOfAmerica {
    public static void main(String[] args) {
        BankAccount Rumeysa=new BankAccount("rumeysa","Aydin");
        //System.out.println(Rumeysa.accountHolder(););
        System.out.println(Rumeysa.getAccountHolder());
        System.out.println(Rumeysa.getBalance());
        Rumeysa.checkBalance();
        Rumeysa.depositing(120);
        Rumeysa.checkBalance();
        Rumeysa.withdrawing(80);
        Rumeysa.checkBalance();//40
        System.out.println(Rumeysa);


        System.out.println(Rumeysa);

        Rumeysa.withdrawing(100);
        System.out.println(Rumeysa);
        Rumeysa.depositing(200000);
        System.out.println(Rumeysa);




    }





}
