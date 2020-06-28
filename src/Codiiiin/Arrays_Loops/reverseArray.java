package Codiiiin.Arrays_Loops;

import Codiiiin.task4.Rectangle;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        for (int i=arr.length-1;i>=0;i--){
            int eachnum=arr[i];
            System.out.println(eachnum);
        }
        System.out.println("======================");
        int[]RevArr=new int[arr.length];//[0,0,0,0,0]
        //RevArr[0]=arr[4];


        int j=arr.length-1;
        for (int i=0;i<arr.length;i++){
            RevArr[i]=arr[j];
            j--;
        }
        System.out.println(Arrays.toString(RevArr));
    }






}
