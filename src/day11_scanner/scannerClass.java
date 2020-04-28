package day11_scanner;

import java.util.Scanner;

public class scannerClass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("enter a long number:");
        long a =input.nextLong();

        System.out.println("you have enter:"+a);

        System.out.println("enter a decimal:");
        double f=input.nextDouble();
        System.out.println("you have enterede:"+f);

        double b=input.nextFloat();//float can be assigned to double
//long c=(int)input.nextFloat()burda floatu longa cevirdik

        System.out.println("you have entered:"+b);

        System.out.println("enter true or false");
       boolean bool= input.nextBoolean();
        System.out.println(bool);

        System.out.println("enter your sentence:");
        String str=input.next();
        System.out.println("you have entered:"+str);





    }
}
