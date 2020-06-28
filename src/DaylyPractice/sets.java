package DaylyPractice;

import java.util.*;

public class sets {
    public static void main(String[] args) {
        Set<String>names=new HashSet<>();//eger siralamadan gitmesini istiyosak LinkHasSet yazmaliyiz
        names.add("Elma");
        names.add("Armut");
        names.add("portakal");
        names.add("elma");
        names.add("Elma");
        names.add("elma");

        System.out.println(names);

        String[]arr={"A","B","C","D","E","F","G","G"};//ABCDEFG
        HashSet<String>set1=new HashSet<>(Arrays.asList(arr));

        System.out.println(set1);
        System.out.println("===================================");
       Set<Integer>numbers=new TreeSet<>();//tree set normal sayi dogrusu
        numbers.addAll(Arrays.asList(10,9,8,7,8,7,6,5,6));
        System.out.println(numbers);

        System.out.println("=========================================");
        TreeSet<String>numm=new TreeSet<>();
        numm.addAll(Arrays.asList("Apple","Banna","Dii","Cucumber"));
        System.out.println(numm);

        System.out.println("========================================");
        TreeSet<String>treeset=new TreeSet<>();//hasset yazarsak o null olur
        treeset.add(null);
        System.out.println(treeset);

        System.out.println("===========================================");
        String number="123";
        int num1=Integer.parseInt(number);
        System.out.println(num1);
        System.out.println("===========================================");
        String[] aarr={null,"Cybertek",null};
        aarr[2].toUpperCase();

        String name1="cybertek".toUpperCase();
        name1=null;
        //name1=name1.toLowerCase();
        System.out.println(name1);







    }



}
