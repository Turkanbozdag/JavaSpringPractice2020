package day52_collection;

import java.util.*;

public class Collections_Utility {
    public static void main(String[] args) {
        List<Integer>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(10,9,8,7,6,5,4));
        Collections.sort(list1);//burda parantesin icine ne listin varsa onu yaziyon
        System.out.println(list1);
        System.out.println("=========================================================");
        //1.Write a program that can remove the duplicates and print out in sorted order
        ArrayList<Integer>nums=new ArrayList();
        nums.addAll(Arrays.asList(100,200,50,50,100,200,300,50));
        TreeSet<Integer>sorted=new TreeSet<>(nums);

       // nums=new ArrayList<>();uzun olursa bu satiri iptal edebilirsin
        new TreeSet<>(nums);//contain set format 1,2,3,4,5,6,7

        nums=new ArrayList<>(new TreeSet<>(nums));

        //System.out.println(sorted);
        System.out.println(nums);
        System.out.println("======================================================");
        //2.write a program that can removed the duplicates from an arraylist.Do not change the order
        //[6,6,6,6,5,5,5,4,4,4,4]
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(6,6,6,6,5,5,5,4,4,4,4));
        list=new ArrayList<>( new LinkedHashSet<>(list ) );//arraylist doesn have any sub classArrayList[6,5,4]
        //                          LinkHashSette[4,5,6]oldu
        System.out.println(list);
        System.out.println("=============================================================");
        //fruquency haw many time it required
        ArrayList<String>letters=new ArrayList<>();
        letters.addAll(Arrays.asList("A","B","C","B","D"));
       boolean result= Collections.frequency(letters,"A")==1;





    }





}
