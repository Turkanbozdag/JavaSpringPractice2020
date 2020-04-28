package Day20ArraysContinue;

import java.util.Arrays;

public class Arrays_Sorting {
    public static void main(String[] args) {
        int[]arr1={9,8,7,6,5,5,3,2,1};
        Arrays.sort(arr1);
        System.out.println(arr1);
        System.out.println("first min num:"+arr1[0]);

        char[]ch={'z','d','w','y','a','b','e','d'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        String[]names={"Deniz","Osman","Rustem","Anna","Ali","Adil"};//follow asci table order
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println("===============");
        int []arr={3,1,4,-1,100,-100,200,155};
        Arrays.sort(arr);
        int[]arrdesc=new int[arr.length];
        System.out.println(arrdesc);
        System.out.println(Arrays.toString(arr));




    }
}
