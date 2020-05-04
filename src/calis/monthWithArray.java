package calis;

import java.util.Scanner;

public class monthWithArray {
    public static void main(String[] args) {
    String[]months={"jan","feb","marc","ap","may","june","july","Agus","sep","oct","Nov","dec"};
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number");

         int num=input.nextInt();

         while(num>12 || num<=0) {
             System.out.println("invalid Entery");
             System.out.println("please re enter the number");
         }
         String result=months[num-1];
        System.out.println(result);


    }
}
