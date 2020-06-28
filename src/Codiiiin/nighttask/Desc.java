package Codiiiin.nighttask;

import javax.swing.*;
import java.util.Arrays;

public class Desc {
    public static void main(String[] args) {


        int[] arr = {3, 1, 4, -1, 100, -100, 200, 155};
        int[]arrdesc=new int[arr.length];
        Arrays.sort(arr);
        int k = 0;
        for(int i = arr.length-1;i>=0;i--){
            arrdesc[k]=arr[i];
            k++;

        }
        System.out.println(Arrays.toString(arrdesc));
    }
}