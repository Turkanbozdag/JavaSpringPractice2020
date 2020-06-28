package Practice1;

import java.util.Scanner;

public class reversedreplit {
    public static void main(String[] args) {
        String str="Universal";

        String reverse1=" "+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        int lastIndexnum= str.length()-1;
       System.out.println(str);
        String reverse2="";
        for (int i=lastIndexnum;i>=0;i--){
            reverse2 +=str.charAt(i);
        }
        System.out.println(reverse2);
        System.out.println("================================");
        String str2="java";
        String reverse3=""+str2.charAt(3)+str2.charAt(2)+str2.charAt(1)+str2.charAt(0);
        System.out.println(reverse3);
        String reverse4=str2.substring(2,3)+str2.substring(1,2)+str2.substring(0,1);
        System.out.println(reverse4);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        String s1="abc";
        String s2="abc";
        System.out.println("s1==s2 is: "+s1==s2);
        System.out.println("s1==s2 is:"+(s1==s2) );

        String ta="A";
        ta=ta.concat("B");
        String tb="C";
        ta=ta+tb;
        System.out.println(ta);


        System.out.println("+++++++++++++++++++++++==========================");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName=scan.next();

        System.out.println("Enter your last name");
        String lastName=scan.next();

        String initials2=firstName.substring(0);














    }

}
