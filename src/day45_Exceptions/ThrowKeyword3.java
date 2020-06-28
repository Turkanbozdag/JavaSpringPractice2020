package day45_Exceptions;

import java.io.IOException;

public class ThrowKeyword3 {
    public static void method1()throws IOException,Exception{
        Thread.sleep(3000);
    }

    public static void main(String[] args) {

        boolean breakTime=true;
        if (breakTime){
            throw new RuntimeException("It's breaak time,we should take break");
        }
        //method1();
        //Thread.sleep(1000);
        int[]arr={5,6,7};
        //System.out.println(arr[100]);
       // System.out.println(9/0);
       //throw  new RuntimeException();
       // System.out.println();
        try{
            throw new RuntimeException();
        }catch (Exception e){

        }

    }






}
