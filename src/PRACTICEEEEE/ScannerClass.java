package PRACTICEEEEE;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
byte num1 =input.nextByte();
        System.out.println(num1);

if (num1%2==0){
    System.out.println(num1+"even number");
}else{
    System.out.println(num1+" is odd number");
}



    }
}
