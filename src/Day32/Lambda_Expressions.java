package Day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {
        Predicate<Integer> oddNumber= x->x %2 !=0;
        ArrayList<Integer>list=new ArrayList<>();
            list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
            list.removeIf(oddNumber);
        System.out.println(list);

        System.out.println("================");
        Predicate<Integer>lessThan5=Y->Y<5;
        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(lessThan5);
        System.out.println(list2);
        System.out.println("=====================");
        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("Murtaza","Muhammed","Boris","Sha","Bilal"));
        System.out.println(names);
        //names.removeIf(startsWithM);
        System.out.println(names);
        System.out.println("==========================");
       // Predicate<String>nameList=new ArrayList<>();
                ArrayList<String>nameList=new ArrayList<>();
        nameList.addAll(Arrays.asList("Muhtar","Alex","Asiya","Dilnaz","Radu"));
        System.out.println("==============");
        ArrayList<Integer>nums=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));//or predicate<Integer>greaterThan5=p->p>5;
        nums.removeIf(p->p>5);//nums.
        System.out.println(nums);



        }






    }

