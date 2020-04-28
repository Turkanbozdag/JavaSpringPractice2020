package Day30_ArrayList;

import java.util.ArrayList;

public class dorduncu {
    /*.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}*/
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(1);
        List.add(4);
        List.add(3);
        ArrayList<Integer>uniques=new ArrayList<>();
        for (int i=0;i<List.size();i++){
            int count=0;
            for(Integer each :List){
                if(each==List.get(i)){//0 1 2
                    count++;
                }

            }
            if(count==1){
                uniques.add(List.get(i));

            }
        }
        //List.get(0)===>

        System.out.println(uniques);
        System.out.println(List);
//





    }

}
