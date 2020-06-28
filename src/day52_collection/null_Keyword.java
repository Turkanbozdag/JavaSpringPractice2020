package day52_collection;

import java.util.ArrayList;

public class null_Keyword {
    static  String str;//null

    public static void main(String[] args) {
        System.out.println(str.charAt(0));
       /// System.out.println(list1.get(1));
       //WebElement element=null;
        String str2=null;
        Integer i1=null;
        //int num=null;

        ArrayList<String>list1=new ArrayList<>();
        list1.add(null);

        System.out.println(list1);
        System.out.println("==============================================");
        String number=null;
        int num1=Integer.parseInt(number);
        System.out.println(num1);
        System.out.println("===================================================");
        String []arr={null,"Cybertek",null};
        arr[2].toUpperCase();

        String name1="cybertek".toUpperCase();
        System.out.println(name1);
        name1=null;
       // name1=name1.toLowerCase();
        System.out.println(name1);

    }
}
