package day11_scanner;

import java.util.Scanner;

public class Scanner_practice1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter your first name:");
        String firstname=input.next();

        System.out.println("enter your last name:");
        String lastname=input.next();

        String fullname=firstname+""+lastname;

        System.out.println("are you emp?");
        boolean employeementstatus=input.nextBoolean();

        double salary=0;
        if (employeementstatus==true){
            System.out.println("enter your salary:");
            salary=input.nextDouble();
        }

        System.out.println("full name"+fullname);
        System.out.println("employed:"+employeementstatus);
        System.out.println("salary:"+salary);









    }



}

