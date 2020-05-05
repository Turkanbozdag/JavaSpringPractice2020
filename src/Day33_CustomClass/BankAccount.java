package Day33_CustomClass;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class BankAccount {
    /*
    atrubutes:accountholder,accountnumber,balance
    actions:checking,withdraw(amaount),deposit(amount)
     */

    String accountHolder;
    long accountNumber;
    double balance;
    public void checkingBalance(){
        System.out.println("Available Balance:"+balance);
    }
    public void withDraw(double amount){
        System.out.println("Withdrawing $"+amount);
        balance-=amount;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public String toString(){
        String result="Account Holder:"+accountHolder+"\nAccount Number:"+accountNumber+"\nAvilable Balance:"+balance;

        return result;

    }

}
