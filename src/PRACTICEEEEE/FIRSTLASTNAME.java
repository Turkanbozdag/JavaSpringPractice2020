package PRACTICEEEEE;

import java.util.Scanner;

public class FIRSTLASTNAME {
    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);

        System.out.println("enter your first name");
        String firstname=scan.next();

        System.out.println("enter last name");
        String lastname=scan.next();
        //String initials=firstname.substring(0,1)+lastname.substring(0,1);
        //initials=initials.toUpperCase();

        String initials=""+firstname.charAt(0)+lastname.charAt(0);

        System.out.println(initials);




    }







}
