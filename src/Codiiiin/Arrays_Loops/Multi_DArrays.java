package Codiiiin.Arrays_Loops;

import java.util.Arrays;

public class Multi_DArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[][]arr2D={{1,2,3}};
        int[]arr1D=arr2D[0];
        System.out.println(Arrays.toString(arr1D));
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.deepToString(arr2D));
            for (int eachelement:arr2D[0]){
                System.out.println(eachelement);
            }
            for(int i=0;i<arr2D[0].length;i++){
                int num =arr2D[0][i];
                System.out.println(num);
            }

    }
}
