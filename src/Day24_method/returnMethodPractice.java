package Day24_method;

import java.util.Arrays;

public class returnMethodPractice {
/*
creat a funtion that can return the max num from any given array
 */
public static void main(String[] args) {
    int[]arr={9,8,7,100,200,50,40};
    int max=maxnumber(arr);
    System.out.println(max);
      int min=minnumber(arr);
    System.out.println(min);

}
 public static int maxnumber(int []arr){
     Arrays.sort(arr);
     return arr[arr.length-1];


 }
 public static int minnumber(int[]arr){
    Arrays.sort(arr);
    return arr[0];
 }
 public static void sortDesendin(int[]arr){

 }


}
