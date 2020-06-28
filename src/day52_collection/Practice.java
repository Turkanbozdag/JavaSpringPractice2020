package day52_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice{
    public static void main(String[] args) {
        /*
        String str="ABABABCDEF";//["A","B","C",'D'
        String[] arr=str.split("");
        LinkedHashSet<String>ls=new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println((ls));
        //ABCDEF
        String result="";
        for (String each:ls){


        }




         */
        String str="ABABABCDEF";
        String[]arr=str.split("");
        str="";
        for (String each:new LinkedHashSet<>(Arrays.asList(arr)) ) {
            str += each;
        }

            System.out.println(str);
        System.out.println("================================================");
        /*
        String str1="abababab";
        String str2="baba";
        String[]arr1=str1.split("");
        String[]arr2=str2.split("");
        TreeSet<String>t1=new TreeSet(Arrays.asList(arr1));
        TreeSet<String>t2=new TreeSet(Arrays.asList(arr2));


        System.out.println(t1);
        System.out.println(t2);

        str1=t1.toString();
        str2=t2.toString();
        System.out.println(str1.equals(str2));

         */
        String str1="ababababC";//abC
        String str2="baba";//ab
        str1=new TreeSet<>(Arrays.asList(str1.split(""))).toString();//to strin bu nu for loop kullanmayalim diye
        str2=new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        System.out.println(str1.equals(str2));



    }
}
