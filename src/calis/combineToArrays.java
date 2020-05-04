package calis;

import java.util.Arrays;

public class combineToArrays {
    public static void main(String[] args) {



        int[]arr1={1,2,3};//arr1 and arr2 combine yapacaz
        int[]arr2={4,5,6,7};
        int[]arr3=new int[arr1.length+arr2.length];//{1,2,3,4,5,6,7};contain arr1 and arr2
        for (int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
         arr3[arr1.length+i]=arr2[i]; // arr3[i]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));








    }
}
