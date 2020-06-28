package day53_Iterartor_Maps;

import java.lang.reflect.Array;
import java.util.*;

public class Collection_Practice {
    /*access-modifiers specifier return-type methodsName(parameter)
    specifiers:static,final,abstarct,synchronized

     */
    public static  void main(String[]args){
        List<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list=Collections.synchronizedList(list);//thread-safe

        Set<Integer>set=new HashSet<>();
        set=Collections.synchronizedSet(set);//thread-safe

        System.out.println("========================================================");
        String[]arr={"E","B","A","D","C","A"};//EBADC
        LinkedHashSet<String>st=new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(st);
        /*
        for (String each:arr){
            st.add(each);
        }

         */
        ArrayList<String>arrayList=new ArrayList<>(Arrays.asList("E","B","A","D","C","A"));//burasi yukardaki string dekileri aliyo
        LinkedHashSet<String>st2=new LinkedHashSet<>(arrayList);
        System.out.println(st2);





    }
    public synchronized void append(){

    }
}
