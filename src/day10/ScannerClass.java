package day10;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("enter number" );

  byte num1=  input.nextByte();
        System.out.println("enter"+num1);
        if (num1%2==0) {

            System.out.println("odd");
        }else{
                System.out.println("even");
            }


    }

}
