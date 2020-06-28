package PRACTICEEEEE;

import java.util.Scanner;
/*Turkan
Aydin
 */
public class StringManipulationPrac34 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter your full name");
        String fullname=input.nextLine();//Turkan Aydin

        String firstname=fullname.substring(0, fullname.indexOf(" ") );
        String lastname=fullname.substring(fullname.indexOf(" ")+1 );

        firstname=firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();
        lastname=lastname.substring(0,1).toUpperCase() +lastname.substring(1).toLowerCase();
                System.out.println("your first name is:"+firstname);
        System.out.println("your last name:"+lastname);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++=++++");






    }
}
