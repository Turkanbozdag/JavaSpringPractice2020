package PRACTICEEEEE;
import java.util.Scanner;
public class SalaryCalulator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//scanner object
        System.out.println("enter your salary:");
        int salary=input.nextInt();

        System.out.println("how many hours do you work per week");
        byte weeklyHours=input.nextByte();
        System.out.println("how many weeks do you work in a year?");
        byte numberOfWeeks=input.nextByte();
        //hourlyrate=(slary/numberofweek)/weeklyhours
        int hourlyRate=(salary/numberOfWeeks)/weeklyHours;
        System.out.println("your hourly rate is:"+hourlyRate);






    }
}
