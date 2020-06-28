package PRACTICEEEEE;

import java.util.Scanner;

public class AppleBanana {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a word");
        String first=input.next();
        first=first.substring(1);

        System.out.println("enter second");
        String second=input.next();
        second=second.substring(1);

        String result=first+second;

        System.out.println(result);
       // System.out.println(second);









    }
}
