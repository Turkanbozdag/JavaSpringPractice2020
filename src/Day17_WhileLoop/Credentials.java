package Day17_WhileLoop;

import java.util.Scanner;

/*
user:cybertek
pass:cybertek123
 */
public class Credentials {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter username");
        String username=input.next();
        System.out.println("enter pass word");
        String password=input.next();
        System.out.println("logged in");
        while (!username.equals("cybertek")&& !password.equals("cybertek123")){
            System.out.println("please re enter yor credentions");
            System.out.println("enter user name");
                    username=input.next();

            System.out.println("enter pass word");
            password=input.next()
;
        }

        System.out.println("logging in");







    }
}
