package PRACTICEEEEE;

import java.util.Scanner;

public class staticpractice {
    static  Scanner scan=new Scanner(System.in);
    //when to use static variable instance of instance

    public  static void main(String[]args){
       // Scanner scan=new Scanner(System.in);
        System.out.println("enter num1");
        int num1=scan.nextInt();
        System.out.println("enter num2");
        int num2=scan.nextInt();

        System.out.println("sum is:"+(num1+num2));
    }
    public void method1(){
       // Scanner scan=new Scanner(System.in);
        System.out.println("enter num1");
        int num1=scan.nextInt();
        System.out.println("enter num2");
        int num2=scan.nextInt();
        System.out.println("multiplication:"+(num1*num2));


    }

}
