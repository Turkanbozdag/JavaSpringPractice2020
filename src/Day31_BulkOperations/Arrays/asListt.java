package Day31_BulkOperations.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class asListt {
    public static void main(String[] args) {

        ArrayList<Integer>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(30,20,40,50,45,35,200));
        System.out.println(list1);
        System.out.println("============================");
        String[] names={"Murtaza","Muhtar","Muhesong","Sada","Rustem"};
        System.out.println(Arrays.toString(names));
        ArrayList<String>nameList=new ArrayList<>();
        nameList.addAll(Arrays.asList(names));
        nameList.add("osman");
        nameList.remove("Muhtar");
        System.out.println(nameList);

        System.out.println("===============");
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4));
        list.retainAll(Arrays.asList(8,9));
        System.out.println(list);







    }
}
