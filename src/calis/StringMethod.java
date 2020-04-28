package calis;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String str="turkan";//6
        char[]character=str.toCharArray();
        System.out.println(Arrays.toString(character));
        System.out.println("============");
        String str1="CYBERTEK SCHOOL";
        String str2="SCHOOL CYBERTEK";

        char[]ch1=str1.toCharArray();
        char[]ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean equalStr=Arrays.equals(ch1,ch2);
        System.out.println(equalStr);
        //System.out.println(Arrays.toString(ch1));
        //System.out.println(Arrays.toString(ch2));





    }
}
