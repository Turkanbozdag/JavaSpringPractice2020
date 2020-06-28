package PRACTICEEEEE;


import java.sql.SQLOutput;
import java.util.Scanner;

public class number_scanner {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);// object of scanner
        System.out.println("enter your first number:");
        int num1=scan.nextInt();
        System.out.println("enter yor second number:");
        int num2=scan.nextInt();

        System.out.println("enter your third number:");
        int num3=scan.nextInt();

        int max=(num1>=num2 && num2>=num3)?num1:(num2>=num1 && num2>=num3)?num2:num3;
        int min=(num1<=num2 && num1<= num3)?num1:(num2<=num1 && num2<=num3)?num2:num3;
        System.out.println("maximum number is:"+max);
        System.out.println(min);



    }
}
