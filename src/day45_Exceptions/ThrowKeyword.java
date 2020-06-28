package day45_Exceptions;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import jdk.nashorn.internal.runtime.ECMAException;

public class ThrowKeyword {
    public static void sleep() {
        try {//disadvantages try catch is to long
            Thread.sleep(3000);
        } catch (Exception e) {

        }
    }
        public static void sleep2() throws InterruptedException{//short than try cath den bununkide disadvantage iscallere some one cant fix it
        Thread.sleep(3000);

    }
    public static void main(String[]args)throws Exception{//burda handel ettik ondan thro exceptioni kullandik

        System.out.println("Cybertek");
        sleep2();
        System.out.println("java");
    }
    public static void method1()throws  Exception{//handel ettik main hata veriyodu cunku
        String[]arr={"A"};
        main(arr);
        //Thread.sleep(3000);
    }
    public static void method2(){
        try {
            method1();
        } catch (Exception e) {
             }

    }
    public static  void method3(){//method onemli burda
        method2();

    }




}
