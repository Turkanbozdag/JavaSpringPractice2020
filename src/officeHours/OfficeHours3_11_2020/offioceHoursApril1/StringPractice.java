package officeHours.OfficeHours3_11_2020.offioceHoursApril1;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
String str1=" ";
boolean r1=str1.isEmpty();
boolean r2=!str1.isEmpty();

        System.out.println(r1);
        System.out.println(r2);
        System.out.println("===========");
        String s1="cat";
        String s2=new String("cat");
        String s3="cat";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s1));
        System.out.println(s3.equalsIgnoreCase(s1));
        System.out.println("========================");

        String txt=input.next();
        System.out.println(txt.substring(2,3));
        System.out.println(txt.charAt(4));
        System.out.println(txt.charAt(5));












    }
}
