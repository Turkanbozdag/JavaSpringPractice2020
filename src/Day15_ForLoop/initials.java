package Day15_ForLoop;

import java.util.Scanner;

/*. write a program that asks user's first and last name, then prints out the initials of the user			Ex:
				input:
					cybertek
					batch12				output:your initial is: CB


 */
public class initials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter your firs name");
        String firstname=scan.next();
        System.out.println("enter your lastname");
        String lastname=scan.next();
        String initials2=firstname.substring(0,1)+lastname.substring(0,1);
        //System.out.println(initials);
        //initials=initials.toUpperCase();
        String initials=""+firstname.charAt(0)+lastname.charAt(0);//returns string
            initials=initials.toUpperCase();
        System.out.println(initials);




    }



}
