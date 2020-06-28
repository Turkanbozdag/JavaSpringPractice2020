package Quizlerehazirlik;

import java.util.Scanner;

public class practiceeee {
    //when to use static variable instead of instance

      static   Scanner scan=new Scanner(System.in);//instance variable

    public static void main(String[] args) {//instance variable ile static variable birlikte kullaninca
        //Scanner scan= new Scanner(System.in);
        System.out.println("enter num1");
        int num1=scan.nextInt();

        System.out.println("enter num2");
        int num2=scan.nextInt();

        System.out.println("sum is: "+(num1+num2));

    }
    public void method1(){
        //Scanner scan=new Scanner(System.in);
        System.out.println("enter num1");
        int num1=scan.nextInt();
        System.out.println("enter num2");
        int num2=scan.nextInt();

        System.out.println("multiplication: "+(num1*num2));
    }

}
