package replit;

import java.util.Scanner;

public class last {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str2="Cybertek";
        int total=str2.length();
        System.out.println(total);
        int maxindex=str2.length()-1;
        char ch3=str2.charAt(maxindex);
        String aa="cybertek";
        aa=aa.concat("school");
        System.out.println(aa);

        String bb="java";
        bb=bb.concat(" is fun");
        System.out.println(bb);

        String g="CYBERTEK SCHOOL";
        g= g.toLowerCase();
        System.out.println(g);

        String h="muhtar";
        h=h.toUpperCase();
        System.out.println(h);

        String r="Cybertek      ";
        r=r.trim();
        System.out.println(r.length());

        String t="a         b";
        t=t.trim();
        System.out.println(t.length());







    }


}
