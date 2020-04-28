package calis;

import java.util.Scanner;

public class weekdays {
    public static void main(String[] args) {
        String[]days={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=input.nextInt();
        if (num>7||num<1){
            System.out.println("invalid entry");
            System.exit(0);
        }
        String result=days[num-1];
        System.out.println(result);
        System.out.println("========");












    }
}
