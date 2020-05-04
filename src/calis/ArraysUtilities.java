package calis;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysUtilities {
    public static void main(String[] args) {
        //Arrays.toString(array);array to string
        int[]arr={1,2,3};
       String r= Arrays.toString(arr);//returns to string
        System.out.println(r);
        System.out.println(arr);//array must ben converted to string before we print

        String names[]={"vildan","mesut","rumeyse","turkan","emir"};
        System.out.println(Arrays.toString(names));
        double[]nums={10,20,30,40,50};

        System.out.println(Arrays.toString(nums));//as string
        System.out.println(nums[0]+1);

        System.out.println("===========================");
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(10);
        list3.add(100);
        list3.add(1000);
        list3.add(20);
        Collections.sort(list3);
        System.out.println(list3);
        for (int i=list3.size()-1;i>=0;i--){
            System.out.print(list3.get(i)+" ");
        }



    }
}
