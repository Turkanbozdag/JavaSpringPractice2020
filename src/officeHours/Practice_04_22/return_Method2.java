package officeHours.Practice_04_22;

import java.lang.reflect.Array;
import java.util.Arrays;

public class return_Method2 {
    //write a return method that can return the scond maximum number from an
    public static void  main(String[]args){
        int[]arr={100,40,500,50,30,100,-5,-100};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int lastIndexNum=arr.length-1;
        int secondLastIndexNum=lastIndexNum-1;//arr.length-2
        //arr.length-1-1=arr.length-2
        int secondMaximum=arr[secondLastIndexNum];
        System.out.println(secondMaximum);

    }
    public static int secondMax(int[]arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int lastIndexNum=arr.length-1;
        int secondLastIndexNum=lastIndexNum-1;//arr.length-2
        int[]arr2={1,2,3,4,5,6,7,8};
        int num2=secondMax(arr2);
        System.out.println(num2);
        //arr.length-1-1=arr.length-2
        int secondMaximum=arr[secondLastIndexNum];
        //System.out.println(secondMaximum);
int secondMax=arr[secondLastIndexNum];
return secondMax;
    }




}
