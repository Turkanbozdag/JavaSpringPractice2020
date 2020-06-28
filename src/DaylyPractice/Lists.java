package DaylyPractice;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        //List<String>list0=new List<>() {}
        List<Integer>list1= new ArrayList<>();//referance
        list1.add(1);
        List<Integer>list2=new LinkedList<>();
        list2.add(10);
        list2.remove(0);
        System.out.println("========================================");
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(10);//boolean


        Vector<Integer>vectorlist=new Vector<>();
        vectorlist.add(10);//aradaki fark synchronized what is synchronized?key word used for achiving thread-safety
        //what is  the thread?process of operating system scheduling object by one by
        // multi-thread: two or more thread are being executed

        Stack<Integer>stack=new Stack<>();//stack has uniqe ebility.last in first out
        stack.add(10);
        System.out.println("======================================================");
        Stack<String>names=new Stack<>();
        names.add("turkan");
        names.add("vildan");
        names.add("Mesut");
        names.add("Rumeysa");
        System.out.println(names);

       String s1= names.pop();//"rumeysa yazacak pop():LIfo,returns the the last object from the stack and removes it from stack
        System.out.println(s1);
        System.out.println(names);

        String s2=names.pop();//mesut yazacak
        System.out.println(s2);
        System.out.println(names);

        names.push("Emir");//push add
        System.out.println(names);






    }






}
