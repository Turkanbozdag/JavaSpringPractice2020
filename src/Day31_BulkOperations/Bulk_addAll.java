package Day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {
    public static void main(String[] args) {


        ArrayList<Integer>list1=new ArrayList<>();
        //add 30,20,40,50,45,35,200
        list1.add(30);
        list1.add(20);
        list1.add(40);
        list1.add(50);
        list1.add(45);
        list1.add(35);
        list1.add(200);

      //  System.out.println(list1);

       // list1.addAll(Arrays.asList(30,20,40,50,45,35,200));
       // System.out.println(list1);
        Integer[]arr1={30,20,40,50,45,35,200};
        list1.addAll(Arrays.asList(arr1));
        System.out.println(list1);
        System.out.println("============================");
        String []names={"turkan","vildan","mesut","rumeysa","Peri"};
        names[2]="mesut";

        System.out.println(Arrays.toString(names));
        ArrayList<String>namelist= new ArrayList<>();
        namelist.addAll(Arrays.asList(names));
        namelist.add("Emir");
        namelist.remove("turkan");
        System.out.println(namelist);
        System.out.println("========================");
        Integer[]numbers ={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer>numlist=new ArrayList<>(Arrays.asList(numbers));
        System.out.println(numlist);







    }
}
