package office04_15;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {

            int[]arr={9,10,8,65,8,6,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[]salaries={};
        int length=salaries.length;
        int lastInde=length-1;

            Arrays.sort(salaries);
        System.out.println(Arrays.toString(salaries));
        int[] tt={9,10,8,65,8,6,5};
        System.out.println(Arrays.toString(tt));
        int [] satis={9,8,10,2,3,4,5,6};
        Arrays.sort(satis);
        System.out.println(Arrays.toString(satis));
        System.out.println("======----===========");
        int []arr1={1,2,3};
        int []arr2={2,1,3};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));
        //char[]ch1=str1.toCharasrray();
       //char[]ch2=str









}
}


