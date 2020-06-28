package PRACTICEEEEE;

import java.util.Scanner;

public class SalaryCalculater {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your salary:");
        int salary=input.nextInt();

        System.out.println("enter the state tax:");

        byte statetax=input.nextByte();
        double stateTaxPercenttage=statetax/100.0;

        System.out.println("enter the federal tax:");
        byte federalTax=input.nextByte();
        double federalTaxPercentage=federalTax/100.0;
        //totaltax=(federaltaxPercentage+sataePercentage)*salary

        double totalTax=(federalTaxPercentage+stateTaxPercenttage)*salary;
        double salaryAftertax=salary-totalTax;


        System.out.println("your salary tax is: $"+salaryAftertax);
        System.out.println("tatol tax :$"+totalTax);









    }
}
