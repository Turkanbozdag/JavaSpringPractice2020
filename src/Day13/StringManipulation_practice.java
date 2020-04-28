package Day13;

import java.util.Scanner;

/*


input:cybertek school
output:
Cybertek
School
 */
public class StringManipulation_practice {
    public static void main(String[] args) {
   Scanner input=new Scanner(System.in);

        System.out.println("enter your fullname");
        String fullname=input.nextLine();//cybertek school

        String firstname=fullname.substring(0, fullname.indexOf(" "));
        String lastname=fullname.substring(fullname.indexOf(" ")+1  );


        firstname=firstname.substring(0,1).toUpperCase()+ firstname.substring(1).toLowerCase();
        lastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();

        System.out.println("your first name is"+firstname);
        System.out.println("your last name is"+lastname);













    }
}
