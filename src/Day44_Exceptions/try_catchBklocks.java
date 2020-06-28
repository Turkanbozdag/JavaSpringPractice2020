package Day44_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class try_catchBklocks {
    public static void main(String[] args) {
        System.out.println("test started");
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5));


        try{//yalniz olamaz catch omak zorunda
            System.out.println(list.get(10));//listede 10 index yok
        }catch (IndexOutOfBoundsException e){//variable java exceptionda e kabul ediyo herseyi verebilirsin
            System.out.println("Something went wrong");
        }
        System.out.println("Test completed");




    }
}
