package Day17_WhileLoop;

import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int min=19999999;
                int minnumber=214798080;
        for (int i=1;i<=5;i++){
            System.out.println("Enter a number");
            int num=input.nextInt();
            if(num<minnumber){//to comper each user input,and assign the minimum number to minnumber
                minnumber=num;

            }
        }
        System.out.println("mini number"+minnumber);
    }
}
