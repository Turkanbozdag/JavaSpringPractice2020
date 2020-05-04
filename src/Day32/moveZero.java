package Day32;

import java.util.ArrayList;
import java.util.Arrays;

/*Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};			output: [1, 2, 3, 4, 0, 0, 0, 0]			DO NOT USE SORT method, DO NOT declear  any extra lists	write a program that can return the duplicated values from an ArrayList of String

 */
public class moveZero {
    public static void main(String[] args) {

//how many zero first think
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        int count=0;
        for (Integer each:list){
            if (each==0){//finding the frequency of zero
                count++;
            }
        }
        System.out.println(count);
        //1234
        list.removeAll(Arrays.asList(0));//removed all the zreos from the list
        System.out.println(list);
        for (int i=0;i<count;i++) {
            list.add(0,0);//0 koy basa alabiliriz sifirlari(0.0)basa aldik yoksa(0)sona:))
        }
        System.out.println(list);


    }
}
