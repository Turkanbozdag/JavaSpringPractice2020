package Day18_nestedLoops;

import java.util.Scanner;

public class nestlooppractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){

        System.out.println("enter two numbers");
        int num1=input.nextInt();
        int num2=input.nextInt();
        System.out.println("Addition of two numbers:" +(num1+num2));
        System.out.println("do you wantto continue");
        String answer=input.next();
        if (answer.equalsIgnoreCase("no")) {// valid
            System.out.println("thank yo for using the calculator");
            break;




        }
        }

    }
}
