package day52_collection;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        //List<String>list0=new List<>();
        List<Integer>list1= new ArrayList<>();
        list1.add(1);
        List<Integer>list2=new LinkedList<>();
        list2.add(10);
        list2.remove(0);
        System.out.println("=======================================");
        ArrayList<Integer>arraylist=new ArrayList<>();
        arraylist.add(10);
        Vector<Integer>vector=new Vector<>();
        vector.add(10);

        Stack<Integer>stack=new Stack<>();
        stack.add(10);
        System.out.println("================================================");
        Stack<String>names=new Stack<>();
        names.add("Sha");
        names.add("Dovran");
        names.add("Rhmas");
        names.add("Anna");
        names.add("Rustam");
        String s1=names.pop();//rustem
        System.out.println(s1);
        System.out.println(names);
        String s2=names.pop();//Anna
        System.out.println(s2);//Anna yazdi
        System.out.println(names);

        names.push("Phu");//add stack
        System.out.println(names);

    }
    public synchronized void method1(){

    }





}
