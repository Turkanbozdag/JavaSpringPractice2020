package day53_Iterartor_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterating_Collection {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));//
        for (int i=0;i<list.size();i++){
            if (list.get(i)<4){
                list.remove(i);
            }

        }
        System.out.println(list);
        System.out.println("===========================================================");
        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));

        list2.removeIf(p->p<4);//uses the teraror inface internally
        System.out.println(list2);


        System.out.println("=======================================================================");

ArrayList<Integer>list3=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
        Iterator<Integer> it=list3.iterator();

        System.out.println(it.hasNext());
        System.out.println(it.next());



       //cut it.hasNext()past while

       while(it.hasNext()){
           if(it.next() <4){
               it.remove();
           }
       }
        System.out.println(list3);
        System.out.println("===========================================");
        ArrayList<Integer>list4=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));

        for (Iterator<Integer>I =list4.iterator();I.hasNext();) {//next bidefa kullanin bi yerde only one time
            if (I.next()<4){

            }

        }
        System.out.println(list4);




    }




}
