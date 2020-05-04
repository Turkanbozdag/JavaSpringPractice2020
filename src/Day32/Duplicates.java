package Day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
list: {"A", "B", "A", "C", "D"};
			output: ["A"] 			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
 */
public class Duplicates {
    public static void main(String[] args) {

ArrayList<String>list=new ArrayList<>();
list.addAll(Arrays.asList("A","B","A","C","D"));
        System.out.println(list);
        ArrayList<String>duplicates= new ArrayList<>();
        for (int i=0;i<list.size();i++){
            int count=0;
            for (String each:list){
                if (each.equals(list.get(i))){
                    count++;
                }
            }               // bunu eklemeden once[A,A]sonuc
            if (count>1 && !duplicates.contains(list.get(i))){//if the frequency is greate than one ,and if it is not countanin in duplicates yet,then we will add than after&&
                duplicates.add(list.get(i));
            }
        }
        System.out.println(duplicates);
        //list.get(0)====>"A"







    }
}
