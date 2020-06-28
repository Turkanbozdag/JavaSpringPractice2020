package PRACTICEEEEE;

public class constructorscall {
    public constructorscall(){
         method1();
         method2();

    }
    public constructorscall(int a){
        this();
    }
    public static void method1(){
        //method2();
       // constructorscall();


    }
    public void method2(){
        method1();
    }





}
