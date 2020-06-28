package Codiiiin;

import java.util.Arrays;

public class Multi_dimensionalArrays {
    public static void main(String[] args) {
        int []arr={1,2,3};
        int[][]arr2D={{1,2,3},{4,5,6 }};
        //              0       1
        System.out.println(arr2D.length);
       //int[]arr1D=arr2D[0];
        System.out.println(Arrays.toString(arr2D[1]));
        int num1=arr2D[1][2];
        System.out.println(num1);
        //{'A','B'}//   0   1     0     1  2
        char[][]ch2D={{'A','B'},{'D','E','F'},{'G','H','I'}};
                     //   0         1
        char c1=ch2D[2] [0];
        System.out.println(c1);
        char[]ch2=ch2D[2];
        System.out.println(Arrays.toString(ch2));

        String[][] str2D={{"A","B","C"},{"D","E","F"},{"j","K","Iove"}};
        String r1=str2D[2][2];
        System.out.println(r1);


    }

}
