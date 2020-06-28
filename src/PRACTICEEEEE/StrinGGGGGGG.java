package PRACTICEEEEE;

import java.util.Scanner;

public class StrinGGGGGGG {
    public static void main(String[] args) {
        String str="I like to learn java. I like to watch bthe movie jumanji";
        int a1=str.indexOf("th");

        System.out.println(a1);

        int a3=str.indexOf("Iea")+1;
        System.out.println(a3);

        String s=" I like java , and I like reading";
        int b1=s.lastIndexOf(" I");
        System.out.println(b1);

        int b2=s.lastIndexOf("e");
        System.out.println(b2);

        String z=" I like C#,C# is cool";

        int c1=z.lastIndexOf("C");

        System.out.println(c1);

        String x="I like java, java is fun, java programing is fun";

        int d1=x.indexOf(",j")+2;//second j'index num
        System.out.println(d1);

        int d3=x.lastIndexOf("j");//last j index number
        System.out.println(d3);
        int d4=x.indexOf("java p");
        System.out.println(d4);
        System.out.println("=========================");
        char ch1=x.charAt(26);
        System.out.println(ch1);
        System.out.println("+++++++++++++++++++++++++++++");
        String str8="I love you vildan";
        boolean bool=str8.isEmpty();//true
        System.out.println(bool);
        System.out.println("_____________");
        String userenam="";
        System.out.println("please provide the user name first");
        String s1="cat";
        String s2=new String("cat");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println("{{{{{{{{{{{{{{{{{{{");

        String z1="Tiger";
        String z2=new String("tiger");
        String z3="Tiger";
        System.out.println(z1==z2);
        System.out.println(z2==z3);
        System.out.println(z1==z3);
        System.out.println(z1.equals(z3));
       // System.out.println(z3.equals(z4));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
        /*
        username:Cybertek
        password:Cybertekschool
         */
        String validusername="cybertek";
        String validpassword="cybertekschool";

        Scanner input= new Scanner(System.in);
        System.out.println("enter your username");
        String inputUsername=input.next();
        System.out.println("enter your password");
        String inputpassword=input.next();

        if (inputUsername.equals(validusername) && inputpassword.equals(validpassword)){
            System.out.println("log in successfully");
        }else{
            System.out.println("invalid credantials");
        }





    }
}
