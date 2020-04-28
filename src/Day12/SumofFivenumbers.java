package Day12;

import java.util.Scanner;

public class SumofFivenumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 5 numbers");


         double num1=  input.nextDouble();
        double num2=  input.nextDouble();
        double num3=  input.nextDouble();
        double num4=  input.nextDouble();
        double num5=  input.nextDouble();

        double sum=0;

        if(num1>0){
            sum+=num1;
        }
        if (num2>0){

        }
        if (num3>0){
            sum+=num3;
        }
        if (num4>0){
            sum+=num4;
        }
        if (num5>0){
            sum+=num5;
        }
        System.out.println("sum of positive:"+sum);



    }
}
