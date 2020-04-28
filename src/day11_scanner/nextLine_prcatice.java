package day11_scanner;

import java.util.Scanner;

public class nextLine_prcatice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter your age:");
        int age=input.nextInt();//30 +enter

        System.out.println("enter your full name:");
        String fullname =input.nextLine();//nextline enter key kabul ediyo

       // System.out.println("enter full name:");
        //String fullname=input.next();
        System.out.println("fullname"+fullname);




















    }


}
