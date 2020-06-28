package Codiiiin.Arrays_Loops;

import java.util.Arrays;

public class Evennumbers {
    public static void main(String[] args) {
        int[]numbers=new int[100];//0 ~99index number
        System.out.println(Arrays.toString(numbers));
        /*
        numbers[0]=1;
        numbers[1]=2;
        */
        for (int i=0;i<numbers.length;i++){
            numbers[i]=i+1;


        }
        System.out.print(Arrays.toString(numbers));
        for(int each:numbers){
            if (each % 2==0){
                continue;
            }
            System.out.print(each+" ");
        }

    }




}
