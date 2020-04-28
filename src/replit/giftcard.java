package replit;

import java.util.Scanner;

public class giftcard {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int giftcard=100;
        String item ="";
        if(item.equals("charger")){
            System.out.println("Thank you for your purchase");
            int b=giftcard-15;

        }else if(item.equals("smartphone")){
            System.out.println("Sorry ,not enough funds on your giftcard");
        }else if (item.equals("usb cable")){
            int balanceusb=giftcard-10;
            System.out.println("Thank you for your purchase"+"\nyour balance is"+balanceusb);


        }else if(item.equals("hat")){
            int balancehat=giftcard-25;
            System.out.println("thank you for your puchase"+"\n your balance is"+balancehat);

        }else if (item.equals("laptop")){
            System.out.println("sorry,not enough funds on your giftcard");
        }else if (item.equals("blanket")){
            int balanceblanket=giftcard-60;
            System.out.println("thank you for your purchase"+"\n yourbalance is"+balanceblanket);

        }else if(item.equals("smartphone")){
            int balancesmartphone=giftcard-300;
            System.out.println("Sorry,not enough funds on you giftcard");
        }else{
            System.out.println("invalid");
        }
        System.out.println();






    }
}
