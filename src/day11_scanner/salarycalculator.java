package day11_scanner;
/*write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax

 */import java.util.Scanner;
public class salarycalculator {

    public static void main(String[] args) {
Scanner input=new Scanner(System.in);//scanner object
        System.out.println("enter your salary:");
        int salary=input.nextInt();

        System.out.println("enter the state tax:");
        byte statetax=input.nextByte();
        double statetaxpercentage=statetax/100.0;

        System.out.println("Enter the federal tax" );
        byte federaltax=input.nextByte();
        double federaltaxpercentage=federaltax/100.0;
        //totaltax=(federaltaxpercentage+statetaxpercentage)*salary
        double totaltax=(federaltaxpercentage+statetaxpercentage)*salary;
        //salaryaftertax=salary-totaltax
        double salaryaftertax=salary-totaltax;
        System.out.println("your salary after tax is:$"+salaryaftertax);
        System.out.println("total tax:$"+totaltax);







    }
}
