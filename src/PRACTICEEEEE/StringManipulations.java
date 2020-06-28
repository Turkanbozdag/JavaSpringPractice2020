package PRACTICEEEEE;

import java.sql.SQLOutput;

public class StringManipulations {
    public static void main(String[] args) {
        String str="cybertek";
        //          012345678
     char ch1= str.charAt(5);
        System.out.println(ch1);

        String myname="turkan";
        char ch2=myname.charAt(5);
        System.out.println(ch2);

        System.out.println(ch1=='T');

       int totallength= str.length();
        System.out.println(totallength);
        System.out.println(totallength>10);

        String str2="today is great day,java is fun";
        int str3=str2.length();
        System.out.println(str3);

        int maxindex=str2.length()-1;
        System.out.println(maxindex);

        String s1="Cybertek";
        s1=s1.concat(" school");//cybertek school
        System.out.println(s1);

        String s9="I Love";
        s9=s9.concat(" you");
        System.out.println(s9.concat(",you are my everthing kids:))"));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        String t="java";
        System.out.println(t.concat("is a programing languages"));
        System.out.println("===================================");
        String r1="java is fun";
        r1=r1.concat(", and it's easy");
        System.out.println(r1);



        String name1="CYBERTEK";
        name1=name1.toLowerCase();
        System.out.println(name1);
        String name2="turkan";
        name2=name2.toUpperCase();
        System.out.println(name2);
        System.out.println("***********************");
        String A1="         today is great day";
        A1=A1.trim();
        System.out.println(A1);












    }
}
