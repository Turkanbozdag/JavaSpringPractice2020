package Day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class ListPractice2 {
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList<>();
        List.add(100);
        List.add(20);
        List.add(300);
        List.add(400);
        List.add(50);
        List.add(700);
        List.add(800);
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<List.size();i++){
            if (List.get(i)>maximum){
                maximum=List.get(i);
            }
        }

        System.out.println(maximum);

            int maximum2=Integer.MIN_VALUE;
            for(Integer each:List){
               // if ((List.get(<i>maximum)){

                }
            }



    }

