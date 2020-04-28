package Day22Arrays_Loop;

import java.util.Arrays;

/* write a program that sort the array in descending order

 */
public class Descending {
    public static void main(String[] args) {
        int[]arr={10,78,2,-1,500,70};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(arr));
        System.out.println("========");
        int[]RevArr=new int[arr.length];
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            RevArr[i]=arr[j];
            j--;
        }

        System.out.println(Arrays.toString(RevArr));





    }

}
