package PRACTICEEEEE;

import java.util.Scanner;

public class loggg {
    public static void main(String[] args) {
        String validUserName="cybertek";
        String validPsaaword="CybertekSchool";

        Scanner input=new Scanner(System.in);
        System.out.println("enter your username");
        String inputUsername=input.next();

        System.out.println("enter your password");
        String inputpssword=input.next();

        boolean validCredentials=inputUsername.equals(validUserName) && inputpssword.equals(validPsaaword);
         if (validCredentials){

             System.out.println("log in succcessfully");
         }else{
             System.out.println("invalid credentials");
         }


    }
}
