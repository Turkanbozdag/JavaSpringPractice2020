package Codiiiin.task3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Bank {
    public void InterestRate() {
        System.out.println("9 percent");
    }

    public static void main(String[] args) {
        BankOfAmerica boa=new BankOfAmerica();
        boa.InterestRate();//5

        Chase chase=new Chase();
        chase.InterestRate();//6

        CapitalOne Co=new CapitalOne();
        Co.InterestRate();
    }
}
class BankOfAmerica extends  Bank{//sub class
public void InterestRate(){
    System.out.println("5%");
}
}
class Chase extends Bank{//sub class

    @Override
public void InterestRate(){
    System.out.println("6%");
}//@Override
//public void print(){//bu override method degil

}

class CapitalOne extends Bank{//sub class

    public void InterestRate(){
        System.out.println("4%");
    }


}





