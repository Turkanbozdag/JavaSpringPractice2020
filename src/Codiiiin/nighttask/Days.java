package Codiiiin.nighttask;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

String[]days={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};

Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int num=input.nextInt();
       // String result=days[num-1];
       // System.out.println(result);

        while(num>7||num<1){
            System.out.println("invalid Entery, please re enter");
            num=input.nextInt();
            //System.exit(0);
        }
            String result=days[num-1];
        System.out.println(result);


    }
}
