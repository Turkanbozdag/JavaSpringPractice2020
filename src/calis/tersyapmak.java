package calis;

import java.util.ArrayList;
import java.util.Arrays;

public class tersyapmak {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        for (int i=1;i<6;i++) {//1 burda element
           // list.add(i);
            System.out.println(list);
            ArrayList<Integer> reversedList = new ArrayList<>();
           // for (int i= list.size() - 1; i>= 0; i--) {


                int eachNumber = list.get(i);
                reversedList.add(eachNumber);
          // }

            //System.out.println(reversedList);
        }

        }







    }

