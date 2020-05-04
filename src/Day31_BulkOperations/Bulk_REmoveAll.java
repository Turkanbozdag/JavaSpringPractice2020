package Day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_REmoveAll {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,3,1,8));
        //remove 1,,3,5,8
        /*
        Integer a=1;
        list.remove(a);
        list.remove(a);
        Integer b=3;
        list.remove(b);
        list.remove(b);

         */
        list.removeAll(Arrays.asList(3,1,5,8));
        Integer[]arr={3,1,5,8};
        System.out.println(Arrays.asList(arr));
        System.out.println("=========================");
        String []names={"Ahmed","john","Ahmet","Aaron","Danile","Ahmet"};
        ArrayList<String>nameList=new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList);
        nameList.removeAll(Arrays.asList("Ahmet"));
        System.out.println(nameList);

        /*
        1.write a program that can remove duplication from
         */





    }
}
