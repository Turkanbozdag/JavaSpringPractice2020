package Day22Arrays_Loop;

import java.util.Arrays;

public class EvenNumber {
    public static void main(String[] args) {
        int[]numbers=new int[200];//index0~99

        System.out.println(Arrays.toString(numbers));//bunu single yazdiracagimizda kullan
       //numbers[0]=1;
        //numbers[1]=2;
        for (int i=0;i<numbers.length;i++){
            numbers[i]=i+1;//i =1 index will be 2because why +1
        }

        System.out.println(Arrays.toString(numbers));
            for(int each:numbers){
                if (each %2!=0){
                    continue;
                }
            System.out.print(each+" ");
        }








    }
}
