package replit;

import java.util.ArrayList;

public class repll {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(5);
        list1.add(7);
        list1.add(8);
        list1.add(1,6);
        System.out.println(list1);
        System.out.println("============");
        ArrayList<String>list2=new ArrayList<>();

        list2.add("A");
        list2.add("B");
        list2.add("c");
        list2.add("D");
        list2.add(1,"H");
        list2.add(1,"O");
        System.out.println(list2);
        System.out.println("======");
        ArrayList<Integer>list3=new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        int a=3;
        list3.remove(2);
        System.out.println(list3);
        System.out.println("=====");
        ArrayList<Integer>list4=new ArrayList<>();
        Integer t=2;
        list4.remove(t);
        System.out.println(list4);
        System.out.println("========");
        ArrayList<Integer>list5=new ArrayList<>();
        list5.add(10);
        list5.add(20);
        list5.add(30);//{10,20,30}
        list5.remove(20);
        //int r=10;
        Integer r=20;
        list5.remove(r);
        System.out.println(list5);



    }





}
