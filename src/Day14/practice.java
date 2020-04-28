package Day14;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String gmail = "cybertekschool@gmail.ccom";

        String userinputgmail = "cybertekschool@gmail.com";//false

        boolean result = gmail.equalsIgnoreCase(userinputgmail);//true

        if (result) {
            System.out.println("");
        }

        String s1 = "Cybertek school";
        boolean r1 = s1.contains("school");//true S yazarsak kabul etmez
        System.out.println(r1);
        System.out.println("=======================");
        /*
        valid password must contain a specilal caharters such as(!,-,$)
        valid password should not conati space
         */
        String password = "mmasd1235";
        if (password.contains(" ")) {
            System.out.println("password cannot have space in it");
        }
        String s3 = "united states";
        System.out.println(s3.startsWith(s3));

        String s4 = "Http";
        System.out.println(s4.startsWith(s4));

        System.out.println("===============");
        String str5 = "cybertek school";
        System.out.println(str5.endsWith("l"));


        String email = "cybertek@yahoo.com";
        if (email.endsWith("@gamil.com")){;
        System.out.println("valid gmail");
        }else{
            System.out.println("invalid gamil");
        }

        System.out.println("Enter first word");
        String word1=input.next();














    }
}
