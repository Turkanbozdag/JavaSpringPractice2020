package calis;

import java.util.Arrays;

public class SortsArrays {
    public static void main(String[] args) {
        /*
        int[]arr={8,5,10,7,12};
        Arrays.sort(arr);
        arr={5,7,8,10,12}*/
        int[]arr1={9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr1);//otomotik sort yapti
        System.out.println(Arrays.toString(arr1));
        System.out.println("first min number is:"+arr1[0]);
        System.out.println("second minnumber is:"+arr1[1]);
        System.out.println("first max number is:"+arr1[arr1.length-1]);//last index bulma length-1
        System.out.println("sceond max is:"+arr1[arr1.length-2]);
        System.out.println("========================");
        char[]ch={'Z','D','W','Y','a','B','e','D'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));
        System.out.println("==================");
        String[]names={"Turkan","Vildan","MEsut","Rumeysa","EMir","EY"};//asci table siralamasina uydu
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println("=======================");
        int[]arr={3,1,4,-1,-100,200,155};
        Arrays.sort(arr);
        int[]arrDesc=new int[arr.length];
        System.out.println(Arrays.toString(arr));
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
           // System.out.println(arr[i]+"");
            arrDesc[j]=arr[i];
            j++;
        }

       // int[] arr ={3,1,4,-1,100,-100,200,155};
        int[]arrDesc1=new int[arr.length];//[0,0,0,0,0,0,0,0,]
        Arrays.sort(arr);//[-100,-1
        System.out.println(Arrays.toString(arr));
        int k=0;
        for (int i=arr.length-1;i>=0;i--){
          // arrDesc= arr[i];
        }





    }
}
