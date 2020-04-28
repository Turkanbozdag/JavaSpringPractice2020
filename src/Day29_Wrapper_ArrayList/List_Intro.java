package Day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {
        //ArrayList<Datatype>                   //optinal
        ArrayList<Integer>scores=new ArrayList<>();//ikinci integer vermek zorunda degilsin

        scores.add(10);//Autoboxing size goin to be 1
        scores.add(20);//Autoboxing,size2
        scores.add(30);//size3
        System.out.println(scores);
        scores.get(2);
        Integer a1=scores.get(2);//non
        int a2=scores.get(2);//unboxin
        double a3=scores.get(2);//unbox
        System.out.println(a3);





    }
}
