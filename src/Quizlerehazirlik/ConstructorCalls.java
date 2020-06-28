package Quizlerehazirlik;

import officeHoursMay13.Constructor;

public class ConstructorCalls {
    public ConstructorCalls(){//only constructor call others
    method1();
    method2();


    }
    public ConstructorCalls(int a){
        //ConstructorCalls();
        this();
    }
    public static void method1(){
       method2();
       // ConstructorCalls();
    }
    public static void method2(){
        method1();
    }
}
