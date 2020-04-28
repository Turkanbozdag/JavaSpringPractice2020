package Day22Arrays_Loop;

import java.util.Arrays;

/* write a program that can reverse the array

 */
public class ReverseArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        for(int i =arr.length-1;i>=0;i--){
            int eachnum=arr[i];
            System.out.println(eachnum);
        }
        System.out.println("=============");
        int[]RevArr=new int[arr.length];
        int j=arr.length;
        for(int i=0;i<arr.length;i++){
            RevArr[i]=arr[j];
            j--;
        }
        System.out.println(Arrays.toString(RevArr));










    }






}
