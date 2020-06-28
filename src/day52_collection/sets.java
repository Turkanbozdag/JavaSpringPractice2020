package day52_collection;

import java.util.*;

public class sets {
    public static void main(String[] args) {
        Set<String>names=new HashSet<>();//LinkedHashset yazarsak ordera dikkat eder siraay gore yazar
        names.add("Sha");
        names.add("Zuura");
        names.add("Saban");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");
        System.out.println(names);
        System.out.println("============================================");
        String[]arr={"A","A","C","B","A"};//ACB
        LinkedHashSet<String>set1=new LinkedHashSet<>(Arrays.asList(arr));//[A,C,B]
        System.out.println(set1);
        //System.out.println(set1.get(1));
        System.out.println("------------------------------------------------------");
        Set<Integer>numbers=new TreeSet<>();
        numbers.addAll(Arrays.asList(10,9,8,7,6,5,6));

        System.out.println(numbers);
        System.out.println("===================================================");
        HashSet<String>hashSet=new HashSet<>();
        hashSet.add(null);
        System.out.println(hashSet);
        TreeSet<String>treeset=new TreeSet<>();//Hasset allow null but TreeSet you can not null
        treeset.add(null);
        System.out.println(treeset);






    }




}
