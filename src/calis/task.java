package calis;

import java.util.Arrays;

public class task {
    public static void Maxnumber(int[]array) {
        Arrays.sort(array);
        System.out.println("maximum is:"+array[array.length-1]);
    }
    public static void minnumber(int[]array){
        Arrays.sort(array);//ascending order
        System.out.println("mininum is:"+array[0]);
    }
    public static void descending(int[]array){
        Arrays.sort(array);
        for (int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]arr={10,8,9,5,4,3,2,1};
       // Maxnumber(arr:10);//10 if parameter is array,the argument must be array
        Maxnumber(arr);
        minnumber(arr);
        int[]arr2={100,20,30,40,-40,-100};
        Maxnumber(arr2);
        minnumber((arr2));
        descending(arr2);


    }

}
