package Codiiiin.nighttask;

import java.util.Arrays;

public class CombinesTwoArrays {
    public static void main(String[] args) {
        int[]arr1={1,2,3};
        int[]arr2={4,5,6,7};

        int[]arr3=new int[arr1.length+arr2.length];

        for (int i=0;i<=arr1.length-1;i++){
            arr3[i]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            arr3[arr1.length+i]=arr2[i];

        }
        System.out.println(Arrays.toString(arr3));
        System.out.println("================================");
        int[]arr={5,9,10,7,11,12};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("first min number is:"+arr[0]);
        System.out.println("second min number is:"+arr[1]);
        System.out.println("first max number is:"+arr[arr.length-1]);

        char[]ch ={'Z','D','W','Y','a','B','E','D'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        String[]names={"Deniz","Osman","Rustem","Ali","Aydin","turkan"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println("+++++++++++++++++++++++++++++++");
        int[]arr6={3,4,1,-100,-200,155,911};
        int[]arrdesc=new int [arr6.length];
        Arrays.sort(arr6);
       // System.out.println(Arrays.toString(arr6));
            int k=0;
        for (int i=arr6.length-1;i>=0;i--){
            arrdesc[k]=arr6[i];
            k++;
            System.out.print(Arrays.toString(arrdesc));
        }


    }
}
