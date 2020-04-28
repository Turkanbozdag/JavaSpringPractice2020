package Day13.Replit;

import java.util.Scanner;

/*Write a program that will print out first and last letters together.

 */
public class replit_62 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
      //  String word = scan.next();//turkan
        //char firstletter=word.charAt(0);
        //char lastletter=word.charAt(word.length()-1);
        //System.out.println(""+firstletter+lastletter);

        System.out.println("=======");

        String txt="foobar";//oar
        String firsttwo=txt.substring(2,3);
        String lasttwo=txt.substring(txt.length()-2);
        System.out.print(firsttwo+lasttwo);
       // System.out.println(lasttwo);


        String lastletter=txt.substring(txt.length()-1);
        System.out.println("=====================");

        String A="            today is       ba day.      ";
        A=A.trim();
        System.out.println(A);

        String str="Cybertek school is the best";
        String schoolname=str.substring(0,7);
        System.out.println(schoolname);

        String fullname="kuzzat Altay";
        String firstname=fullname.substring(0,6);
        String lastname=fullname.substring(7,11+1);
        System.out.println(firstname);
        System.out.println(lastname);
        String all=lastname.concat("_").concat(firstname).concat("@gmail.com");
        System.out.println(all);
        String s="I love java programin language";
        String s2=s.substring(7);
        System.out.println(s2);
        String e="I like C# progma C# C#";
        e=e.replace("C#","java");
        System.out.println(e);
        String r="I like C#,C#,is fun C# is cool";
       r =r.replaceFirst("C#","Java");
        System.out.println(r);
        String r1="today is sunday,today is saturday";
        r1=r1.replaceFirst("today","tomorrow");
        System.out.println(r1);

    }
}
