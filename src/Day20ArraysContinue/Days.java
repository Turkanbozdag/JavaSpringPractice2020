package Day20ArraysContinue;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        String[] days={"Monday","tuesday","wednesday","thursday","friday","saturday","sunday"};

        Scanner input =new Scanner(System.in);
        System.out.println("enter number:");
        int num=input.nextInt();//6
        while(num>7||num<1){//if kaldirip while yaptim surekli calisi
            System.out.println("invalid,please re enter the number");
            num=input.nextInt();
        }
       // int num=input.nextInt();//saturday diyelim 6 burdan getirdik
        String result=days[num-1];//burasi string oldugunu num-1
        System.out.println(result);







    }
}
