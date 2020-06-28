package PRACTICEEEEE;

public class Stringliterals {
    public static void main(String[] args) {

        String str1="cat";
        String str2=new String("cat");//java heap
        System.out.println(str1+":"+str2);
        System.out.println(str1==str2);

        String str3="cat";//String pool
        System.out.println(str1==str3);//true




        String s1="java";//String pool,immutable we cannot modify it
        s1="javaScript";
        System.out.println(s1);//java Script
        String s2="java";//no new objected in the memory

        System.out.println(s1==s2);




    }
}
