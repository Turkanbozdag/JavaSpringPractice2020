package Day12;

import java.util.Scanner;

public class Salarycalculator {
      /*ask the user enter salary
        ask the user enter fullname
        ask the user to enter company name
        ask the user to enter jobtitel

         */

    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);//1000enter

        System.out.println("enter your salary:");
        double salary =input.nextDouble();//1000

        input.nextLine();//enter buraya geldi burasi*******


        System.out.println("enter full name");
        String fullname=input.nextLine();//

        System.out.println("enter company name");
        String companyname=input.nextLine();

        System.out.println("enter your ssn");
        long ssn=input.nextLong();//

        input.nextLine();//****enter

        System.out.println("enter job titel");
        String jobtitle=input.nextLine();

        System.out.println("fullname is:"+fullname);
        System.out.println("job title is:"+jobtitle);
        System.out.println("company name:"+companyname);
        System.out.println("ssn:"+ssn);
        System.out.println("salary is: $"+salary);






    }
}
