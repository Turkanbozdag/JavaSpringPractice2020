package Day24_method;

import java.util.Scanner;

public class Methods_withParameters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your age");
        byte age=scan.nextByte();
        EligibleToBUyAlcohol(age);//explicit casting

    }
    public static void EligibleToBUyAlcohol(int age) {
        if(age>=21){
            System.out.println("eligible to by alcohol");
        }else{
            System.out.println("eligible to buy milk");
        }

    }
}
