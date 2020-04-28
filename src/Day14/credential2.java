package Day14;

import java.util.Scanner;

/* valid credential are:
username:cybertek
password:
scybertekscholl
 username and password cannot be empty if they are empt please credentials
is user entere both log in
is valid password invalid usrenma is incorrect
if valid user name invalid password password is incorrect
both willbe invalid
 */
public class credential2{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("enter your user name");
        String inputusername=input.next();

        System.out.println("enterpassword");
        String inputpassword=input.next();

        if (!inputusername.isEmpty()&& !inputpassword.isEmpty()){
            if (inputusername.equals("cybertek")&& inputpassword.equals("cybertekschool")){

            }
        }
        else {//empty ise
            System.out.println("please enter the crenditial");


        }


















    }
}
