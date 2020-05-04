package calis;
import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        String[]days={"mon","tues","we","thur","fri","saturday","sunday"};
        Scanner input=new Scanner(System.in);
        System.out.println("enter a nuber:");
        int num=input.nextInt();

        while(num>7||num<1){
            System.out.println("invalid");
            num =input.nextInt();
            System.exit(0);
        }

        String result=days[num-1];
        System.out.println(result);


    }
}
