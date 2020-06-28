package Day35_Static;

import java.util.Scanner;

public class StaticPractice {
//when to use static variable instead of instance
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter num1");
        int num1=scan.nextInt();
        System.out.println("enter num2");
        int num2=scan.nextInt();

        System.out.println("sum is:"+(num1+num2));



    }
    public void method(){

        Scanner scan =new Scanner(System.in);
        System.out.println("enter num1");
        int num1=scan.nextInt();
        System.out.println("enter num2");
        int num2=scan.nextInt();
        System.out.println("multiplication:"+(num1*num2));



    }
}
