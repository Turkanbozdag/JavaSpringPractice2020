package Practice1;

import org.w3c.dom.ls.LSOutput;

public class BankofCitizien {
    public static void main(String[] args) {
        BankAccount Azra = new BankAccount("Azra:", "Aydin");
       // System.out.println(Azra.AccountHolder());private

        System.out.println(Azra.getAccountHolder());
        System.out.println(Azra.getBalance());

        Azra.checkBalance();
        Azra.deposting(120);
        Azra.checkBalance();
        Azra.withdrawing(80);
        Azra.checkBalance();



    }
}
