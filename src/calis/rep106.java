package calis;
import java.util.Arrays;
import java.util.Scanner;

/*Given a String variable sentence, write code to type each word in separate lines.

Example:

sentence -> "Java is fun"

Print

Java

is

fun

 */
public class rep106 {
    public static void main(String[] args) {

        double[]nums={10,20,30,40,50};
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]+1);

int[]arr1={1,2,3};
int[]arr2={4,5,6,7};
        int[]arr3=new int[arr1.length+arr2.length];
        System.out.println(arr3);
        System.out.println("========");
        int[]arrr={1,2,3};
        int[]arr22={4,5,6,7};

        int[]arr33=new int[arr1.length+arr2.length];

        for (int i=0;i<arrr.length;i++) {
            arr33[i] = arrr[i];
        }
       //for (int i=0;i<arr22.length;i++){
         //   arr33[arrr.length+i]=arr22[i];
        //}
        System.out.println(Arrays.toString(arr33));






    }
}
