package Day31_BulkOperations;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String>list1= new ArrayList<>();
        list1.add("");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        boolean r1=list1.contains("Z");
        System.out.println(r1);
        ArrayList<Integer>list3= new ArrayList<>();
        list3.add(10);
        list3.add(100);
        list3.add(1000);
        list3.add(20);
        //excepted:1000,100,20,10
        Collections.sort(list3);
        System.out.println(list3);
        ArrayList<Integer>reversedlist3= new ArrayList<>();
        for (int i=list3.size()-1;i>=0;i--){
            //System.out.print(list3.get(i)+" ");
            reversedlist3.add(list3.get(i));
        }
        System.out.println(reversedlist3);
        System.out.println(list3);

        list3.clear();//removes everything,size 0
        boolean r4=list3.isEmpty()
;
        System.out.println(r4);


    }
}
