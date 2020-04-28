package Day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer>List1=new ArrayList<>();
        List1.add(5);
        List1.add(7);
        List1.add(8);

        List1.add(6);
        List1.add(1,6);//after
        //{5,6,7,8}
       // List1.add(7,10);index out of bound
        List1.set(3,9);
        System.out.println(List1);
        int[]arr={1,2,3,4};//{1,2,3,4,5}
        arr[3]=5;
        System.out.println(List1);
        System.out.println("===========================");
        ArrayList<Integer>List3=new ArrayList<>();
        List3.add(1);//0
        List3.add(2);//1
        List3.add(3);//2
        List3.add(4);//3
        System.out.println(List3);





    }
}
