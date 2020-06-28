package DaylyPractice;

import java.util.ArrayList;

public class null_Keyword {
    static  String str=new String("Cybertek");//==null

    static ArrayList<Integer>list1;

    public static void main(String[] args) {
        System.out.println(str.charAt(0));
       // System.out.println(list1.get(1));
        //WebElement elemnt=null;
        String str2=null;
        Integer i1=null;
        //int num=null;
        ArrayList<String>list1=new ArrayList<>();
        list1.add(null);

        System.out.println(list1);
    }

}
